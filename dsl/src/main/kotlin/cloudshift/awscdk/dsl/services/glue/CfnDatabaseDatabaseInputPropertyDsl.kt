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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDatabase

/**
 * The structure used to create or update a database.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object parameters;
 * DatabaseInputProperty databaseInputProperty = DatabaseInputProperty.builder()
 * .createTableDefaultPermissions(List.of(PrincipalPrivilegesProperty.builder()
 * .permissions(List.of("permissions"))
 * .principal(DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
 * .build())
 * .build()))
 * .description("description")
 * .federatedDatabase(FederatedDatabaseProperty.builder()
 * .connectionName("connectionName")
 * .identifier("identifier")
 * .build())
 * .locationUri("locationUri")
 * .name("name")
 * .parameters(parameters)
 * .targetDatabase(DatabaseIdentifierProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html)
 */
@CdkDslMarker
public class CfnDatabaseDatabaseInputPropertyDsl {
    private val cdkBuilder: CfnDatabase.DatabaseInputProperty.Builder =
        CfnDatabase.DatabaseInputProperty.builder()

    private val _createTableDefaultPermissions: MutableList<Any> = mutableListOf()

    /**
     * @param createTableDefaultPermissions Creates a set of default permissions on the table for
     *   principals. Used by AWS Lake Formation . Not used in the normal course of AWS Glue
     *   operations.
     */
    public fun createTableDefaultPermissions(vararg createTableDefaultPermissions: Any) {
        _createTableDefaultPermissions.addAll(listOf(*createTableDefaultPermissions))
    }

    /**
     * @param createTableDefaultPermissions Creates a set of default permissions on the table for
     *   principals. Used by AWS Lake Formation . Not used in the normal course of AWS Glue
     *   operations.
     */
    public fun createTableDefaultPermissions(createTableDefaultPermissions: Collection<Any>) {
        _createTableDefaultPermissions.addAll(createTableDefaultPermissions)
    }

    /**
     * @param createTableDefaultPermissions Creates a set of default permissions on the table for
     *   principals. Used by AWS Lake Formation . Not used in the normal course of AWS Glue
     *   operations.
     */
    public fun createTableDefaultPermissions(createTableDefaultPermissions: IResolvable) {
        cdkBuilder.createTableDefaultPermissions(createTableDefaultPermissions)
    }

    /** @param description A description of the database. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param federatedDatabase A `FederatedDatabase` structure that references an entity outside
     *   the AWS Glue Data Catalog .
     */
    public fun federatedDatabase(federatedDatabase: IResolvable) {
        cdkBuilder.federatedDatabase(federatedDatabase)
    }

    /**
     * @param federatedDatabase A `FederatedDatabase` structure that references an entity outside
     *   the AWS Glue Data Catalog .
     */
    public fun federatedDatabase(federatedDatabase: CfnDatabase.FederatedDatabaseProperty) {
        cdkBuilder.federatedDatabase(federatedDatabase)
    }

    /** @param locationUri The location of the database (for example, an HDFS path). */
    public fun locationUri(locationUri: String) {
        cdkBuilder.locationUri(locationUri)
    }

    /**
     * @param name The name of the database. For Hive compatibility, this is folded to lowercase
     *   when it is stored.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param parameters These key-value pairs define parameters and properties of the database. */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /** @param parameters These key-value pairs define parameters and properties of the database. */
    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param targetDatabase A `DatabaseIdentifier` structure that describes a target database for
     *   resource linking.
     */
    public fun targetDatabase(targetDatabase: IResolvable) {
        cdkBuilder.targetDatabase(targetDatabase)
    }

    /**
     * @param targetDatabase A `DatabaseIdentifier` structure that describes a target database for
     *   resource linking.
     */
    public fun targetDatabase(targetDatabase: CfnDatabase.DatabaseIdentifierProperty) {
        cdkBuilder.targetDatabase(targetDatabase)
    }

    public fun build(): CfnDatabase.DatabaseInputProperty {
        if (_createTableDefaultPermissions.isNotEmpty())
            cdkBuilder.createTableDefaultPermissions(_createTableDefaultPermissions)
        return cdkBuilder.build()
    }
}
