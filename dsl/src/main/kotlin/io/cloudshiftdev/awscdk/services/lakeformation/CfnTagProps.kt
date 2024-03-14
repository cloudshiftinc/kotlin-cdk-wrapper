package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTagProps {
  /**
   * Catalog id string, not less than 1 or more than 255 bytes long, matching the [single-line
   * string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   *
   * The identifier for the Data Catalog . By default, the account ID. The Data Catalog is the
   * persistent metadata store. It contains database definitions, table definitions, and other control
   * information to manage your AWS Lake Formation environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-catalogid)
   */
  public fun catalogId(): String? = unwrap(this).getCatalogId()

  /**
   * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   *
   * The key-name for the LF-tag.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagkey)
   */
  public fun tagKey(): String

  /**
   * An array of UTF-8 strings, not less than 1 or more than 50 strings.
   *
   * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagvalues)
   */
  public fun tagValues(): List<String>

  /**
   * A builder for [CfnTagProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param catalogId Catalog id string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     * The identifier for the Data Catalog . By default, the account ID. The Data Catalog is the
     * persistent metadata store. It contains database definitions, table definitions, and other
     * control information to manage your AWS Lake Formation environment.
     */
    public fun catalogId(catalogId: String)

    /**
     * @param tagKey UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     * The key-name for the LF-tag.
     */
    public fun tagKey(tagKey: String)

    /**
     * @param tagValues An array of UTF-8 strings, not less than 1 or more than 50 strings. 
     * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
     */
    public fun tagValues(tagValues: List<String>)

    /**
     * @param tagValues An array of UTF-8 strings, not less than 1 or more than 50 strings. 
     * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
     */
    public fun tagValues(vararg tagValues: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lakeformation.CfnTagProps.Builder =
        software.amazon.awscdk.services.lakeformation.CfnTagProps.builder()

    /**
     * @param catalogId Catalog id string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     * The identifier for the Data Catalog . By default, the account ID. The Data Catalog is the
     * persistent metadata store. It contains database definitions, table definitions, and other
     * control information to manage your AWS Lake Formation environment.
     */
    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    /**
     * @param tagKey UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     * The key-name for the LF-tag.
     */
    override fun tagKey(tagKey: String) {
      cdkBuilder.tagKey(tagKey)
    }

    /**
     * @param tagValues An array of UTF-8 strings, not less than 1 or more than 50 strings. 
     * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
     */
    override fun tagValues(tagValues: List<String>) {
      cdkBuilder.tagValues(tagValues)
    }

    /**
     * @param tagValues An array of UTF-8 strings, not less than 1 or more than 50 strings. 
     * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
     */
    override fun tagValues(vararg tagValues: String): Unit = tagValues(tagValues.toList())

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnTagProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagProps,
  ) : CdkObject(cdkObject), CfnTagProps {
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
     */
    override fun catalogId(): String? = unwrap(this).getCatalogId()

    /**
     * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * The key-name for the LF-tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagkey)
     */
    override fun tagKey(): String = unwrap(this).getTagKey()

    /**
     * An array of UTF-8 strings, not less than 1 or more than 50 strings.
     *
     * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagvalues)
     */
    override fun tagValues(): List<String> = unwrap(this).getTagValues()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTagProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagProps):
        CfnTagProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTagProps):
        software.amazon.awscdk.services.lakeformation.CfnTagProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lakeformation.CfnTagProps
  }
}
