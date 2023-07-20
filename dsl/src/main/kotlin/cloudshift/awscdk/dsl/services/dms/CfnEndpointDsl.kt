@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEndpointDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEndpoint.Builder = CfnEndpoint.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun docDbSettings(docDbSettings: IResolvable) {
        cdkBuilder.docDbSettings(docDbSettings)
    }

    public fun docDbSettings(docDbSettings: CfnEndpoint.DocDbSettingsProperty) {
        cdkBuilder.docDbSettings(docDbSettings)
    }

    public fun dynamoDbSettings(dynamoDbSettings: IResolvable) {
        cdkBuilder.dynamoDbSettings(dynamoDbSettings)
    }

    public fun dynamoDbSettings(dynamoDbSettings: CfnEndpoint.DynamoDbSettingsProperty) {
        cdkBuilder.dynamoDbSettings(dynamoDbSettings)
    }

    public fun elasticsearchSettings(elasticsearchSettings: IResolvable) {
        cdkBuilder.elasticsearchSettings(elasticsearchSettings)
    }

    public fun elasticsearchSettings(elasticsearchSettings: CfnEndpoint.ElasticsearchSettingsProperty) {
        cdkBuilder.elasticsearchSettings(elasticsearchSettings)
    }

    public fun endpointIdentifier(endpointIdentifier: String) {
        cdkBuilder.endpointIdentifier(endpointIdentifier)
    }

    public fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
    }

    public fun engineName(engineName: String) {
        cdkBuilder.engineName(engineName)
    }

    public fun extraConnectionAttributes(extraConnectionAttributes: String) {
        cdkBuilder.extraConnectionAttributes(extraConnectionAttributes)
    }

    public fun gcpMySqlSettings(gcpMySqlSettings: IResolvable) {
        cdkBuilder.gcpMySqlSettings(gcpMySqlSettings)
    }

    public fun gcpMySqlSettings(gcpMySqlSettings: CfnEndpoint.GcpMySQLSettingsProperty) {
        cdkBuilder.gcpMySqlSettings(gcpMySqlSettings)
    }

    public fun ibmDb2Settings(ibmDb2Settings: IResolvable) {
        cdkBuilder.ibmDb2Settings(ibmDb2Settings)
    }

    public fun ibmDb2Settings(ibmDb2Settings: CfnEndpoint.IbmDb2SettingsProperty) {
        cdkBuilder.ibmDb2Settings(ibmDb2Settings)
    }

    public fun kafkaSettings(kafkaSettings: IResolvable) {
        cdkBuilder.kafkaSettings(kafkaSettings)
    }

    public fun kafkaSettings(kafkaSettings: CfnEndpoint.KafkaSettingsProperty) {
        cdkBuilder.kafkaSettings(kafkaSettings)
    }

    public fun kinesisSettings(kinesisSettings: IResolvable) {
        cdkBuilder.kinesisSettings(kinesisSettings)
    }

    public fun kinesisSettings(kinesisSettings: CfnEndpoint.KinesisSettingsProperty) {
        cdkBuilder.kinesisSettings(kinesisSettings)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun microsoftSqlServerSettings(microsoftSqlServerSettings: IResolvable) {
        cdkBuilder.microsoftSqlServerSettings(microsoftSqlServerSettings)
    }

    public fun microsoftSqlServerSettings(microsoftSqlServerSettings: CfnEndpoint.MicrosoftSqlServerSettingsProperty) {
        cdkBuilder.microsoftSqlServerSettings(microsoftSqlServerSettings)
    }

    public fun mongoDbSettings(mongoDbSettings: IResolvable) {
        cdkBuilder.mongoDbSettings(mongoDbSettings)
    }

    public fun mongoDbSettings(mongoDbSettings: CfnEndpoint.MongoDbSettingsProperty) {
        cdkBuilder.mongoDbSettings(mongoDbSettings)
    }

    public fun mySqlSettings(mySqlSettings: IResolvable) {
        cdkBuilder.mySqlSettings(mySqlSettings)
    }

    public fun mySqlSettings(mySqlSettings: CfnEndpoint.MySqlSettingsProperty) {
        cdkBuilder.mySqlSettings(mySqlSettings)
    }

    public fun neptuneSettings(neptuneSettings: IResolvable) {
        cdkBuilder.neptuneSettings(neptuneSettings)
    }

    public fun neptuneSettings(neptuneSettings: CfnEndpoint.NeptuneSettingsProperty) {
        cdkBuilder.neptuneSettings(neptuneSettings)
    }

    public fun oracleSettings(oracleSettings: IResolvable) {
        cdkBuilder.oracleSettings(oracleSettings)
    }

    public fun oracleSettings(oracleSettings: CfnEndpoint.OracleSettingsProperty) {
        cdkBuilder.oracleSettings(oracleSettings)
    }

    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun postgreSqlSettings(postgreSqlSettings: IResolvable) {
        cdkBuilder.postgreSqlSettings(postgreSqlSettings)
    }

    public fun postgreSqlSettings(postgreSqlSettings: CfnEndpoint.PostgreSqlSettingsProperty) {
        cdkBuilder.postgreSqlSettings(postgreSqlSettings)
    }

    public fun redisSettings(redisSettings: IResolvable) {
        cdkBuilder.redisSettings(redisSettings)
    }

    public fun redisSettings(redisSettings: CfnEndpoint.RedisSettingsProperty) {
        cdkBuilder.redisSettings(redisSettings)
    }

    public fun redshiftSettings(redshiftSettings: IResolvable) {
        cdkBuilder.redshiftSettings(redshiftSettings)
    }

    public fun redshiftSettings(redshiftSettings: CfnEndpoint.RedshiftSettingsProperty) {
        cdkBuilder.redshiftSettings(redshiftSettings)
    }

    public fun resourceIdentifier(resourceIdentifier: String) {
        cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    public fun s3Settings(s3Settings: IResolvable) {
        cdkBuilder.s3Settings(s3Settings)
    }

    public fun s3Settings(s3Settings: CfnEndpoint.S3SettingsProperty) {
        cdkBuilder.s3Settings(s3Settings)
    }

    public fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
    }

    public fun sslMode(sslMode: String) {
        cdkBuilder.sslMode(sslMode)
    }

    public fun sybaseSettings(sybaseSettings: IResolvable) {
        cdkBuilder.sybaseSettings(sybaseSettings)
    }

    public fun sybaseSettings(sybaseSettings: CfnEndpoint.SybaseSettingsProperty) {
        cdkBuilder.sybaseSettings(sybaseSettings)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnEndpoint {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
