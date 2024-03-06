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

package io.cloudshiftdev.awscdkdsl.services.backup

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.backup.BackupResource
import software.amazon.awscdk.services.backup.TagOperation
import software.constructs.Construct

/**
 * A resource to backup.
 *
 * Example:
 * ```
 * BackupPlan plan;
 * Vpc vpc;
 * ITable myTable = Table.fromTableName(this, "Table", "myTableName");
 * DatabaseInstance myDatabaseInstance = DatabaseInstance.Builder.create(this, "DatabaseInstance")
 * .engine(DatabaseInstanceEngine.mysql(MySqlInstanceEngineProps.builder().version(MysqlEngineVersion.VER_8_0_26).build()))
 * .vpc(vpc)
 * .build();
 * DatabaseCluster myDatabaseCluster = DatabaseCluster.Builder.create(this, "DatabaseCluster")
 * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_2_08_1).build()))
 * .credentials(Credentials.fromGeneratedSecret("clusteradmin"))
 * .instanceProps(InstanceProps.builder()
 * .vpc(vpc)
 * .build())
 * .build();
 * ServerlessCluster myServerlessCluster = ServerlessCluster.Builder.create(this,
 * "ServerlessCluster")
 * .engine(DatabaseClusterEngine.AURORA_POSTGRESQL)
 * .parameterGroup(ParameterGroup.fromParameterGroupName(this, "ParameterGroup",
 * "default.aurora-postgresql11"))
 * .vpc(vpc)
 * .build();
 * Construct myCoolConstruct = new Construct(this, "MyCoolConstruct");
 * plan.addSelection("Selection", BackupSelectionOptions.builder()
 * .resources(List.of(BackupResource.fromDynamoDbTable(myTable),
 * BackupResource.fromRdsDatabaseInstance(myDatabaseInstance),
 * BackupResource.fromRdsDatabaseCluster(myDatabaseCluster),
 * BackupResource.fromRdsServerlessCluster(myServerlessCluster), BackupResource.fromTag("stage",
 * "prod"), BackupResource.fromConstruct(myCoolConstruct)))
 * .build());
 * ```
 */
@CdkDslMarker
public class BackupResourceDsl(
    resource: String,
    construct: Construct,
) {
    private val cdkBuilder: BackupResource.Builder =
        BackupResource.Builder.create(resource, construct)

    /**
     * The key in a key-value pair.
     *
     * For example, in `"ec2:ResourceTag/Department": "accounting"`, `ec2:ResourceTag/Department` is
     * the key.
     *
     * @param key The key in a key-value pair.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * An operation that is applied to a key-value pair used to filter resources in a selection.
     *
     * Default: STRING_EQUALS
     *
     * @param operation An operation that is applied to a key-value pair used to filter resources in
     *   a selection.
     */
    public fun operation(operation: TagOperation) {
        cdkBuilder.operation(operation)
    }

    /**
     * The value in a key-value pair.
     *
     * For example, in `"ec2:ResourceTag/Department": "accounting"`, `accounting` is the value.
     *
     * @param value The value in a key-value pair.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): BackupResource = cdkBuilder.build()
}
