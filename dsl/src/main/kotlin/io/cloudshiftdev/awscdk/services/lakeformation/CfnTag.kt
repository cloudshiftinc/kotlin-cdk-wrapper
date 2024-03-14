package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTag internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lakeformation.CfnTag,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Catalog id string, not less than 1 or more than 255 bytes long, matching the [single-line
   * string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   */
  public open fun catalogId(): String? = unwrap(this).getCatalogId()

  /**
   * Catalog id string, not less than 1 or more than 255 bytes long, matching the [single-line
   * string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   */
  public open fun catalogId(`value`: String) {
    unwrap(this).setCatalogId(`value`)
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
   * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   */
  public open fun tagKey(): String = unwrap(this).getTagKey()

  /**
   * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   */
  public open fun tagKey(`value`: String) {
    unwrap(this).setTagKey(`value`)
  }

  /**
   * An array of UTF-8 strings, not less than 1 or more than 50 strings.
   */
  public open fun tagValues(): List<String> = unwrap(this).getTagValues()

  /**
   * An array of UTF-8 strings, not less than 1 or more than 50 strings.
   */
  public open fun tagValues(`value`: List<String>) {
    unwrap(this).setTagValues(`value`)
  }

  /**
   * An array of UTF-8 strings, not less than 1 or more than 50 strings.
   */
  public open fun tagValues(vararg `value`: String): Unit = tagValues(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lakeformation.CfnTag].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Catalog id string, not less than 1 or more than 255 bytes long, matching the [single-line
     * string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * The identifier for the Data Catalog . By default, the account ID. The Data Catalog is the
     * persistent metadata store. It contains database definitions, table definitions, and other
     * control information to manage your AWS Lake Formation environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-catalogid)
     * @param catalogId Catalog id string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     */
    public fun catalogId(catalogId: String)

    /**
     * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * The key-name for the LF-tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagkey)
     * @param tagKey UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     */
    public fun tagKey(tagKey: String)

    /**
     * An array of UTF-8 strings, not less than 1 or more than 50 strings.
     *
     * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagvalues)
     * @param tagValues An array of UTF-8 strings, not less than 1 or more than 50 strings. 
     */
    public fun tagValues(tagValues: List<String>)

    /**
     * An array of UTF-8 strings, not less than 1 or more than 50 strings.
     *
     * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagvalues)
     * @param tagValues An array of UTF-8 strings, not less than 1 or more than 50 strings. 
     */
    public fun tagValues(vararg tagValues: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lakeformation.CfnTag.Builder =
        software.amazon.awscdk.services.lakeformation.CfnTag.Builder.create(scope, id)

    /**
     * Catalog id string, not less than 1 or more than 255 bytes long, matching the [single-line
     * string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * The identifier for the Data Catalog . By default, the account ID. The Data Catalog is the
     * persistent metadata store. It contains database definitions, table definitions, and other
     * control information to manage your AWS Lake Formation environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-catalogid)
     * @param catalogId Catalog id string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     */
    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    /**
     * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * The key-name for the LF-tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagkey)
     * @param tagKey UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     */
    override fun tagKey(tagKey: String) {
      cdkBuilder.tagKey(tagKey)
    }

    /**
     * An array of UTF-8 strings, not less than 1 or more than 50 strings.
     *
     * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagvalues)
     * @param tagValues An array of UTF-8 strings, not less than 1 or more than 50 strings. 
     */
    override fun tagValues(tagValues: List<String>) {
      cdkBuilder.tagValues(tagValues)
    }

    /**
     * An array of UTF-8 strings, not less than 1 or more than 50 strings.
     *
     * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagvalues)
     * @param tagValues An array of UTF-8 strings, not less than 1 or more than 50 strings. 
     */
    override fun tagValues(vararg tagValues: String): Unit = tagValues(tagValues.toList())

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnTag = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lakeformation.CfnTag.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTag {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTag(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTag): CfnTag =
        CfnTag(cdkObject)

    internal fun unwrap(wrapped: CfnTag): software.amazon.awscdk.services.lakeformation.CfnTag =
        wrapped.cdkObject
  }
}
