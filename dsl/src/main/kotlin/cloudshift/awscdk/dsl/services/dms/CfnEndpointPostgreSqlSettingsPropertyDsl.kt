@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint

/**
 * Provides information that defines a PostgreSQL endpoint.
 *
 * This information includes the output format of records applied to the endpoint and details of
 * transaction and control table data information. For information about other available settings,
 * see
 * [Extra connection attributes when using PostgreSQL as a source for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib)
 * and
 * [Extra connection attributes when using PostgreSQL as a target for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.PostgreSQL.html#CHAP_Target.PostgreSQL.ConnectionAttrib)
 * in the *AWS Database Migration Service User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * PostgreSqlSettingsProperty postgreSqlSettingsProperty = PostgreSqlSettingsProperty.builder()
 * .afterConnectScript("afterConnectScript")
 * .captureDdls(false)
 * .ddlArtifactsSchema("ddlArtifactsSchema")
 * .executeTimeout(123)
 * .failTasksOnLobTruncation(false)
 * .heartbeatEnable(false)
 * .heartbeatFrequency(123)
 * .heartbeatSchema("heartbeatSchema")
 * .mapBooleanAsBoolean(false)
 * .maxFileSize(123)
 * .pluginName("pluginName")
 * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
 * .secretsManagerSecretId("secretsManagerSecretId")
 * .slotName("slotName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-postgresqlsettings.html)
 */
@CdkDslMarker
public class CfnEndpointPostgreSqlSettingsPropertyDsl {
    private val cdkBuilder: CfnEndpoint.PostgreSqlSettingsProperty.Builder =
        CfnEndpoint.PostgreSqlSettingsProperty.builder()

    /**
     * @param afterConnectScript For use with change data capture (CDC) only, this attribute has AWS
     *   DMS bypass foreign keys and user triggers to reduce the time it takes to bulk load data.
     *   Example: `afterConnectScript=SET session_replication_role='replica'`
     */
    public fun afterConnectScript(afterConnectScript: String) {
        cdkBuilder.afterConnectScript(afterConnectScript)
    }

    /**
     * @param captureDdls To capture DDL events, AWS DMS creates various artifacts in the PostgreSQL
     *   database when the task starts. You can later remove these artifacts.
     *
     * If this value is set to `N` , you don't have to create tables or triggers on the source
     * database.
     */
    public fun captureDdls(captureDdls: Boolean) {
        cdkBuilder.captureDdls(captureDdls)
    }

    /**
     * @param captureDdls To capture DDL events, AWS DMS creates various artifacts in the PostgreSQL
     *   database when the task starts. You can later remove these artifacts.
     *
     * If this value is set to `N` , you don't have to create tables or triggers on the source
     * database.
     */
    public fun captureDdls(captureDdls: IResolvable) {
        cdkBuilder.captureDdls(captureDdls)
    }

    /**
     * @param ddlArtifactsSchema The schema in which the operational DDL database artifacts are
     *   created. Example: `ddlArtifactsSchema=xyzddlschema;`
     */
    public fun ddlArtifactsSchema(ddlArtifactsSchema: String) {
        cdkBuilder.ddlArtifactsSchema(ddlArtifactsSchema)
    }

    /**
     * @param executeTimeout Sets the client statement timeout for the PostgreSQL instance, in
     *   seconds. The default value is 60 seconds. Example: `executeTimeout=100;`
     */
    public fun executeTimeout(executeTimeout: Number) {
        cdkBuilder.executeTimeout(executeTimeout)
    }

    /**
     * @param failTasksOnLobTruncation When set to `true` , this value causes a task to fail if the
     *   actual size of a LOB column is greater than the specified `LobMaxSize` . If task is set to
     *   Limited LOB mode and this option is set to true, the task fails instead of truncating the
     *   LOB data.
     */
    public fun failTasksOnLobTruncation(failTasksOnLobTruncation: Boolean) {
        cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation)
    }

    /**
     * @param failTasksOnLobTruncation When set to `true` , this value causes a task to fail if the
     *   actual size of a LOB column is greater than the specified `LobMaxSize` . If task is set to
     *   Limited LOB mode and this option is set to true, the task fails instead of truncating the
     *   LOB data.
     */
    public fun failTasksOnLobTruncation(failTasksOnLobTruncation: IResolvable) {
        cdkBuilder.failTasksOnLobTruncation(failTasksOnLobTruncation)
    }

    /**
     * @param heartbeatEnable The write-ahead log (WAL) heartbeat feature mimics a dummy
     *   transaction. By doing this, it prevents idle logical replication slots from holding onto
     *   old WAL logs, which can result in storage full situations on the source. This heartbeat
     *   keeps `restart_lsn` moving and prevents storage full scenarios.
     */
    public fun heartbeatEnable(heartbeatEnable: Boolean) {
        cdkBuilder.heartbeatEnable(heartbeatEnable)
    }

    /**
     * @param heartbeatEnable The write-ahead log (WAL) heartbeat feature mimics a dummy
     *   transaction. By doing this, it prevents idle logical replication slots from holding onto
     *   old WAL logs, which can result in storage full situations on the source. This heartbeat
     *   keeps `restart_lsn` moving and prevents storage full scenarios.
     */
    public fun heartbeatEnable(heartbeatEnable: IResolvable) {
        cdkBuilder.heartbeatEnable(heartbeatEnable)
    }

    /** @param heartbeatFrequency Sets the WAL heartbeat frequency (in minutes). */
    public fun heartbeatFrequency(heartbeatFrequency: Number) {
        cdkBuilder.heartbeatFrequency(heartbeatFrequency)
    }

    /** @param heartbeatSchema Sets the schema in which the heartbeat artifacts are created. */
    public fun heartbeatSchema(heartbeatSchema: String) {
        cdkBuilder.heartbeatSchema(heartbeatSchema)
    }

    /** @param mapBooleanAsBoolean the value to be set. */
    public fun mapBooleanAsBoolean(mapBooleanAsBoolean: Boolean) {
        cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean)
    }

    /** @param mapBooleanAsBoolean the value to be set. */
    public fun mapBooleanAsBoolean(mapBooleanAsBoolean: IResolvable) {
        cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean)
    }

    /**
     * @param maxFileSize Specifies the maximum size (in KB) of any .csv file used to transfer data
     *   to PostgreSQL. Example: `maxFileSize=512`
     */
    public fun maxFileSize(maxFileSize: Number) {
        cdkBuilder.maxFileSize(maxFileSize)
    }

    /** @param pluginName Specifies the plugin to use to create a replication slot. */
    public fun pluginName(pluginName: String) {
        cdkBuilder.pluginName(pluginName)
    }

    /**
     * @param secretsManagerAccessRoleArn The full Amazon Resource Name (ARN) of the IAM role that
     *   specifies AWS DMS as the trusted entity and grants the required permissions to access the
     *   value in `SecretsManagerSecret` . The role must allow the `iam:PassRole` action.
     *   `SecretsManagerSecret` has the value of the AWS Secrets Manager secret that allows access
     *   to the PostgreSQL endpoint.
     *
     * You can specify one of two sets of values for these permissions. You can specify the values
     * for this setting and `SecretsManagerSecretId` . Or you can specify clear-text values for
     * `UserName` , `Password` , `ServerName` , and `Port` . You can't specify both.
     *
     * For more information on creating this `SecretsManagerSecret` , the corresponding
     * `SecretsManagerAccessRoleArn` , and the `SecretsManagerSecretId` that is required to access
     * it, see
     * [Using secrets to access AWS Database Migration Service resources](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager)
     * in the *AWS Database Migration Service User Guide* .
     */
    public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
    }

    /**
     * @param secretsManagerSecretId The full ARN, partial ARN, or display name of the
     *   `SecretsManagerSecret` that contains the PostgreSQL endpoint connection details.
     */
    public fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
    }

    /**
     * @param slotName Sets the name of a previously created logical replication slot for a change
     *   data capture (CDC) load of the PostgreSQL source instance. When used with the
     *   `CdcStartPosition` request parameter for the AWS DMS API , this attribute also makes it
     *   possible to use native CDC start points. DMS verifies that the specified logical
     *   replication slot exists before starting the CDC load task. It also verifies that the task
     *   was created with a valid setting of `CdcStartPosition` . If the specified slot doesn't
     *   exist or the task doesn't have a valid `CdcStartPosition` setting, DMS raises an error.
     *
     * For more information about setting the `CdcStartPosition` request parameter, see
     * [Determining a CDC native start point](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Task.CDC.html#CHAP_Task.CDC.StartPoint.Native)
     * in the *AWS Database Migration Service User Guide* . For more information about using
     * `CdcStartPosition` , see
     * [CreateReplicationTask](https://docs.aws.amazon.com/dms/latest/APIReference/API_CreateReplicationTask.html)
     * ,
     * [StartReplicationTask](https://docs.aws.amazon.com/dms/latest/APIReference/API_StartReplicationTask.html)
     * , and
     * [ModifyReplicationTask](https://docs.aws.amazon.com/dms/latest/APIReference/API_ModifyReplicationTask.html)
     * .
     */
    public fun slotName(slotName: String) {
        cdkBuilder.slotName(slotName)
    }

    public fun build(): CfnEndpoint.PostgreSqlSettingsProperty = cdkBuilder.build()
}
