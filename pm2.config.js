module.exports = {
    apps: [
        {
            name: 'api',
            args: [
                "-jar",
                "build/libs/jalgoarena-api-2.1.0-SNAPSHOT.jar"
            ],
            script: 'java',
            env: {
                PORT: 5001
            }
        }
    ]
};
