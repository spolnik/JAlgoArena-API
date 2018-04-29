module.exports = {
    apps: [
        {
            name: 'api',
            args: [
                "-jar",
                "build/libs/jalgoarena-api-2.0.0-SNAPSHOT.jar"
            ],
            script: 'java',
            env: {
                PORT: 5001,
                EUREKA_URL: 'http://localhost:5000/eureka/'
            }
        }
    ]
};
