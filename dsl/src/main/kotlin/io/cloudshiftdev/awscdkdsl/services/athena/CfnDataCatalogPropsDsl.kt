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

package io.cloudshiftdev.awscdkdsl.services.athena

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnDataCatalogProps

/**
 * Properties for defining a `CfnDataCatalog`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.athena.*;
 * CfnDataCatalogProps cfnDataCatalogProps = CfnDataCatalogProps.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html)
 */
@CdkDslMarker
public class CfnDataCatalogPropsDsl {
    private val cdkBuilder: CfnDataCatalogProps.Builder = CfnDataCatalogProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description A description of the data catalog. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param name The name of the data catalog. The catalog name must be unique for the AWS account
     *   and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param parameters Specifies the Lambda function or functions to use for the data catalog. The
     *   mapping used depends on the catalog type.
     * * The `HIVE` data catalog type uses the following syntax. The `metadata-function` parameter
     *   is required. `The sdk-version` parameter is optional and defaults to the currently
     *   supported version.
     *
     * `metadata-function= *lambda_arn* , sdk-version= *version_number*`
     * * The `LAMBDA` data catalog type uses one of the following sets of required parameters, but
     *   not both.
     * * When one Lambda function processes metadata and another Lambda function reads data, the
     *   following syntax is used. Both parameters are required.
     *
     * `metadata-function= *lambda_arn* , record-function= *lambda_arn*`
     * * A composite Lambda function that processes both metadata and data uses the following
     *   syntax.
     *
     * `function= *lambda_arn*`
     * * The `GLUE` type takes a catalog ID parameter and is required. The `*catalog_id*` is the
     *   account ID of the AWS account to which the Glue catalog belongs.
     *
     * `catalog-id= *catalog_id*`
     * * The `GLUE` data catalog type also applies to the default `AwsDataCatalog` that already
     *   exists in your account, of which you can have only one and cannot modify.
     * * Queries that specify a GLUE data catalog other than the default `AwsDataCatalog` must be
     *   run on Athena engine version 2.
     * * In Regions where Athena engine version 2 is not available, creating new GLUE data catalogs
     *   results in an `INVALID_INPUT` error.
     */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param parameters Specifies the Lambda function or functions to use for the data catalog. The
     *   mapping used depends on the catalog type.
     * * The `HIVE` data catalog type uses the following syntax. The `metadata-function` parameter
     *   is required. `The sdk-version` parameter is optional and defaults to the currently
     *   supported version.
     *
     * `metadata-function= *lambda_arn* , sdk-version= *version_number*`
     * * The `LAMBDA` data catalog type uses one of the following sets of required parameters, but
     *   not both.
     * * When one Lambda function processes metadata and another Lambda function reads data, the
     *   following syntax is used. Both parameters are required.
     *
     * `metadata-function= *lambda_arn* , record-function= *lambda_arn*`
     * * A composite Lambda function that processes both metadata and data uses the following
     *   syntax.
     *
     * `function= *lambda_arn*`
     * * The `GLUE` type takes a catalog ID parameter and is required. The `*catalog_id*` is the
     *   account ID of the AWS account to which the Glue catalog belongs.
     *
     * `catalog-id= *catalog_id*`
     * * The `GLUE` data catalog type also applies to the default `AwsDataCatalog` that already
     *   exists in your account, of which you can have only one and cannot modify.
     * * Queries that specify a GLUE data catalog other than the default `AwsDataCatalog` must be
     *   run on Athena engine version 2.
     * * In Regions where Athena engine version 2 is not available, creating new GLUE data catalogs
     *   results in an `INVALID_INPUT` error.
     */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /** @param tags The tags (key-value pairs) to associate with this resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags (key-value pairs) to associate with this resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param type The type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue
     *   Catalog, or `HIVE` for an external hive metastore.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDataCatalogProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
