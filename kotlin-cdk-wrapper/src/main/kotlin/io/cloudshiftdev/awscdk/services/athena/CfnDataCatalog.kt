@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.athena

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::Athena::DataCatalog resource specifies an Amazon Athena data catalog, which contains a
 * name, description, type, parameters, and tags.
 *
 * For more information, see
 * [DataCatalog](https://docs.aws.amazon.com/athena/latest/APIReference/API_DataCatalog.html) in the
 * *Amazon Athena API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.athena.*;
 * CfnDataCatalog cfnDataCatalog = CfnDataCatalog.Builder.create(this, "MyCfnDataCatalog")
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
public open class CfnDataCatalog internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.athena.CfnDataCatalog,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * A description of the data catalog.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the data catalog.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the data catalog.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the data catalog.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies the Lambda function or functions to use for the data catalog.
   */
  public open fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * Specifies the Lambda function or functions to use for the data catalog.
   */
  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the Lambda function or functions to use for the data catalog.
   */
  public open fun parameters(`value`: Map<String, String>) {
    unwrap(this).setParameters(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags (key-value pairs) to associate with this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags (key-value pairs) to associate with this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags (key-value pairs) to associate with this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or
   * `HIVE` for an external hive metastore.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or
   * `HIVE` for an external hive metastore.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.athena.CfnDataCatalog].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the data catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-description)
     * @param description A description of the data catalog. 
     */
    public fun description(description: String)

    /**
     * The name of the data catalog.
     *
     * The catalog name must be unique for the AWS account and can use a maximum of 128
     * alphanumeric, underscore, at sign, or hyphen characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-name)
     * @param name The name of the data catalog. 
     */
    public fun name(name: String)

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
     * @param parameters Specifies the Lambda function or functions to use for the data catalog. 
     */
    public fun parameters(parameters: IResolvable)

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
     * @param parameters Specifies the Lambda function or functions to use for the data catalog. 
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * The tags (key-value pairs) to associate with this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-tags)
     * @param tags The tags (key-value pairs) to associate with this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags (key-value pairs) to associate with this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-tags)
     * @param tags The tags (key-value pairs) to associate with this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or
     * `HIVE` for an external hive metastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-type)
     * @param type The type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue
     * Catalog, or `HIVE` for an external hive metastore. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.athena.CfnDataCatalog.Builder =
        software.amazon.awscdk.services.athena.CfnDataCatalog.Builder.create(scope, id)

    /**
     * A description of the data catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-description)
     * @param description A description of the data catalog. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the data catalog.
     *
     * The catalog name must be unique for the AWS account and can use a maximum of 128
     * alphanumeric, underscore, at sign, or hyphen characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-name)
     * @param name The name of the data catalog. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param parameters Specifies the Lambda function or functions to use for the data catalog. 
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

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
     * @param parameters Specifies the Lambda function or functions to use for the data catalog. 
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * The tags (key-value pairs) to associate with this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-tags)
     * @param tags The tags (key-value pairs) to associate with this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags (key-value pairs) to associate with this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-tags)
     * @param tags The tags (key-value pairs) to associate with this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue Catalog, or
     * `HIVE` for an external hive metastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-athena-datacatalog.html#cfn-athena-datacatalog-type)
     * @param type The type of data catalog: `LAMBDA` for a federated catalog, `GLUE` for AWS Glue
     * Catalog, or `HIVE` for an external hive metastore. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.athena.CfnDataCatalog = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.athena.CfnDataCatalog.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataCatalog {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataCatalog(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnDataCatalog):
        CfnDataCatalog = CfnDataCatalog(cdkObject)

    internal fun unwrap(wrapped: CfnDataCatalog):
        software.amazon.awscdk.services.athena.CfnDataCatalog = wrapped.cdkObject
  }
}
