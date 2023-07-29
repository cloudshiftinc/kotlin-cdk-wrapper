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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnDatabase
import software.constructs.Construct

/**
 * The `AWS::Glue::Database` resource specifies a logical grouping of tables in AWS Glue .
 *
 * For more information, see
 * [Defining a Database in Your Data Catalog](https://docs.aws.amazon.com/glue/latest/dg/define-database.html)
 * and
 * [Database Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-databases.html#aws-glue-api-catalog-databases-Database)
 * in the *AWS Glue Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object parameters;
 * CfnDatabase cfnDatabase = CfnDatabase.Builder.create(this, "MyCfnDatabase")
 * .catalogId("catalogId")
 * .databaseInput(DatabaseInputProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html)
 */
@CdkDslMarker
public class CfnDatabaseDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDatabase.Builder = CfnDatabase.Builder.create(scope, id)

    /**
     * The AWS account ID for the account in which to create the catalog object.
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-catalogid)
     *
     * @param catalogId The AWS account ID for the account in which to create the catalog object.
     */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /**
     * The metadata for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-databaseinput)
     *
     * @param databaseInput The metadata for the database.
     */
    public fun databaseInput(databaseInput: IResolvable) {
        cdkBuilder.databaseInput(databaseInput)
    }

    /**
     * The metadata for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-databaseinput)
     *
     * @param databaseInput The metadata for the database.
     */
    public fun databaseInput(databaseInput: CfnDatabase.DatabaseInputProperty) {
        cdkBuilder.databaseInput(databaseInput)
    }

    public fun build(): CfnDatabase = cdkBuilder.build()
}
