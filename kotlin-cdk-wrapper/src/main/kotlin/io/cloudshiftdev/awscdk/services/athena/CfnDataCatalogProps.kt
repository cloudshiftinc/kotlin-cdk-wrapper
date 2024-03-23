@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.athena

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnDataCatalog`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.athena.*;
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
public interface CfnDataCatalogProps {
  /**
   * A description of the data catalog.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the data catalog.
   *
   * The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric,
   * underscore, at sign, or hyphen characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-name)
   */
  public fun name(): String

  /**
   * Specifies the Lambda function or functions to use for the data catalog.
   *
   * The mapping used depends on the catalog type.
   *
   * * The `HIVE` data catalog type uses the following syntax. The `metadata-function` parameter is
   * required. `The sdk-version` parameter is optional and defaults to the currently supported version.
   *
   * `metadata-function= *lambda_arn* , sdk-version= *version_number*`
   *
   * * The `LAMBDA` data catalog type uses one of the following sets of required parameters, but not
   * both.
   * * When one Lambda function processes metadata and another Lambda function reads data, the
   * following syntax is used. Both parameters are required.
   *
   * `metadata-function= *lambda_arn* , record-function= *lambda_arn*`
   *
   * * A composite Lambda function that processes both metadata and data uses the following syntax.
   *
   * `function= *lambda_arn*`
   *
   * * The `GLUE` type takes a catalog ID parameter and is required. The `*catalog_id*` is the
   * account ID of the AWS account to which the Glue catalog belongs.
   *
   * `catalog-id= *catalog_id*`
   *
   * * The `GLUE` data catalog type also applies to the default `AwsDataCatalog` that already exists
   * in your account, of which you can have only one and cannot modify.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * The tags (key-value pairs) to associate with this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or
   * `HIVE` for an external hive metastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnDataCatalogProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the data catalog.
     */
    public fun description(description: String)

    /**
     * @param name The name of the data catalog. 
     * The catalog name must be unique for the AWS account and can use a maximum of 128
     * alphanumeric, underscore, at sign, or hyphen characters.
     */
    public fun name(name: String)

    /**
     * @param parameters Specifies the Lambda function or functions to use for the data catalog.
     * The mapping used depends on the catalog type.
     *
     * * The `HIVE` data catalog type uses the following syntax. The `metadata-function` parameter
     * is required. `The sdk-version` parameter is optional and defaults to the currently supported
     * version.
     *
     * `metadata-function= *lambda_arn* , sdk-version= *version_number*`
     *
     * * The `LAMBDA` data catalog type uses one of the following sets of required parameters, but
     * not both.
     * * When one Lambda function processes metadata and another Lambda function reads data, the
     * following syntax is used. Both parameters are required.
     *
     * `metadata-function= *lambda_arn* , record-function= *lambda_arn*`
     *
     * * A composite Lambda function that processes both metadata and data uses the following
     * syntax.
     *
     * `function= *lambda_arn*`
     *
     * * The `GLUE` type takes a catalog ID parameter and is required. The `*catalog_id*` is the
     * account ID of the AWS account to which the Glue catalog belongs.
     *
     * `catalog-id= *catalog_id*`
     *
     * * The `GLUE` data catalog type also applies to the default `AwsDataCatalog` that already
     * exists in your account, of which you can have only one and cannot modify.
     */
    public fun parameters(parameters: IResolvable)

    /**
     * @param parameters Specifies the Lambda function or functions to use for the data catalog.
     * The mapping used depends on the catalog type.
     *
     * * The `HIVE` data catalog type uses the following syntax. The `metadata-function` parameter
     * is required. `The sdk-version` parameter is optional and defaults to the currently supported
     * version.
     *
     * `metadata-function= *lambda_arn* , sdk-version= *version_number*`
     *
     * * The `LAMBDA` data catalog type uses one of the following sets of required parameters, but
     * not both.
     * * When one Lambda function processes metadata and another Lambda function reads data, the
     * following syntax is used. Both parameters are required.
     *
     * `metadata-function= *lambda_arn* , record-function= *lambda_arn*`
     *
     * * A composite Lambda function that processes both metadata and data uses the following
     * syntax.
     *
     * `function= *lambda_arn*`
     *
     * * The `GLUE` type takes a catalog ID parameter and is required. The `*catalog_id*` is the
     * account ID of the AWS account to which the Glue catalog belongs.
     *
     * `catalog-id= *catalog_id*`
     *
     * * The `GLUE` data catalog type also applies to the default `AwsDataCatalog` that already
     * exists in your account, of which you can have only one and cannot modify.
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * @param tags The tags (key-value pairs) to associate with this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags (key-value pairs) to associate with this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue
     * Catalog, or `HIVE` for an external hive metastore. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.athena.CfnDataCatalogProps.Builder =
        software.amazon.awscdk.services.athena.CfnDataCatalogProps.builder()

    /**
     * @param description A description of the data catalog.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the data catalog. 
     * The catalog name must be unique for the AWS account and can use a maximum of 128
     * alphanumeric, underscore, at sign, or hyphen characters.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parameters Specifies the Lambda function or functions to use for the data catalog.
     * The mapping used depends on the catalog type.
     *
     * * The `HIVE` data catalog type uses the following syntax. The `metadata-function` parameter
     * is required. `The sdk-version` parameter is optional and defaults to the currently supported
     * version.
     *
     * `metadata-function= *lambda_arn* , sdk-version= *version_number*`
     *
     * * The `LAMBDA` data catalog type uses one of the following sets of required parameters, but
     * not both.
     * * When one Lambda function processes metadata and another Lambda function reads data, the
     * following syntax is used. Both parameters are required.
     *
     * `metadata-function= *lambda_arn* , record-function= *lambda_arn*`
     *
     * * A composite Lambda function that processes both metadata and data uses the following
     * syntax.
     *
     * `function= *lambda_arn*`
     *
     * * The `GLUE` type takes a catalog ID parameter and is required. The `*catalog_id*` is the
     * account ID of the AWS account to which the Glue catalog belongs.
     *
     * `catalog-id= *catalog_id*`
     *
     * * The `GLUE` data catalog type also applies to the default `AwsDataCatalog` that already
     * exists in your account, of which you can have only one and cannot modify.
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    /**
     * @param parameters Specifies the Lambda function or functions to use for the data catalog.
     * The mapping used depends on the catalog type.
     *
     * * The `HIVE` data catalog type uses the following syntax. The `metadata-function` parameter
     * is required. `The sdk-version` parameter is optional and defaults to the currently supported
     * version.
     *
     * `metadata-function= *lambda_arn* , sdk-version= *version_number*`
     *
     * * The `LAMBDA` data catalog type uses one of the following sets of required parameters, but
     * not both.
     * * When one Lambda function processes metadata and another Lambda function reads data, the
     * following syntax is used. Both parameters are required.
     *
     * `metadata-function= *lambda_arn* , record-function= *lambda_arn*`
     *
     * * A composite Lambda function that processes both metadata and data uses the following
     * syntax.
     *
     * `function= *lambda_arn*`
     *
     * * The `GLUE` type takes a catalog ID parameter and is required. The `*catalog_id*` is the
     * account ID of the AWS account to which the Glue catalog belongs.
     *
     * `catalog-id= *catalog_id*`
     *
     * * The `GLUE` data catalog type also applies to the default `AwsDataCatalog` that already
     * exists in your account, of which you can have only one and cannot modify.
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param tags The tags (key-value pairs) to associate with this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags (key-value pairs) to associate with this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue
     * Catalog, or `HIVE` for an external hive metastore. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.athena.CfnDataCatalogProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.athena.CfnDataCatalogProps,
  ) : CdkObject(cdkObject), CfnDataCatalogProps {
    /**
     * A description of the data catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the data catalog.
     *
     * The catalog name must be unique for the AWS account and can use a maximum of 128
     * alphanumeric, underscore, at sign, or hyphen characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Specifies the Lambda function or functions to use for the data catalog.
     *
     * The mapping used depends on the catalog type.
     *
     * * The `HIVE` data catalog type uses the following syntax. The `metadata-function` parameter
     * is required. `The sdk-version` parameter is optional and defaults to the currently supported
     * version.
     *
     * `metadata-function= *lambda_arn* , sdk-version= *version_number*`
     *
     * * The `LAMBDA` data catalog type uses one of the following sets of required parameters, but
     * not both.
     * * When one Lambda function processes metadata and another Lambda function reads data, the
     * following syntax is used. Both parameters are required.
     *
     * `metadata-function= *lambda_arn* , record-function= *lambda_arn*`
     *
     * * A composite Lambda function that processes both metadata and data uses the following
     * syntax.
     *
     * `function= *lambda_arn*`
     *
     * * The `GLUE` type takes a catalog ID parameter and is required. The `*catalog_id*` is the
     * account ID of the AWS account to which the Glue catalog belongs.
     *
     * `catalog-id= *catalog_id*`
     *
     * * The `GLUE` data catalog type also applies to the default `AwsDataCatalog` that already
     * exists in your account, of which you can have only one and cannot modify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The tags (key-value pairs) to associate with this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or
     * `HIVE` for an external hive metastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataCatalogProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnDataCatalogProps):
        CfnDataCatalogProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDataCatalogProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataCatalogProps):
        software.amazon.awscdk.services.athena.CfnDataCatalogProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.athena.CfnDataCatalogProps
  }
}
