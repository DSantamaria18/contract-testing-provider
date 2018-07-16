import org.springframework.cloud.contract.spec.Contract;

Contract.make {
    description "should return Millenium Falcon"

    request {
        url "/starship?id=10"
        method GET()
    }

    response {
        status 200

        headers {
            contentType(applicationJson())
        }

        body (
            name: "Millenium Falcon",
            model: "YT-1300 light freighter",
            anufacturer: "Corellian Engineering Corporation",
            cost_in_credits: 100000,
            length: 34.37F,
            max_atmosphering_speed: 1050,
            crew: 4,
            passengers: 6,
            cargo_capacity: 100000,
            starship_class: "Light freighter"
        )

    }
}