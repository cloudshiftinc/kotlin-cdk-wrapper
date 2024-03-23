@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnCustomEntityType`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * Object tags;
 * CfnCustomEntityTypeProps cfnCustomEntityTypeProps = CfnCustomEntityTypeProps.builder()
 * .contextWords(List.of("contextWords"))
 * .name("name")
 * .regexString("regexString")
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html)
 */
public interface CfnCustomEntityTypeProps {
  /**
   * A list of context words.
   *
   * If none of these context words are found within the vicinity of the regular expression the data
   * will not be detected as sensitive data.
   *
   * If no context words are passed only a regular expression is checked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-contextwords)
   */
  public fun contextWords(): List<String> = unwrap(this).getContextWords() ?: emptyList()

  /**
   * A name for the custom pattern that allows it to be retrieved or deleted later.
   *
   * This name must be unique per AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A regular expression string that is used for detecting sensitive data in a custom pattern.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-regexstring)
   */
  public fun regexString(): String? = unwrap(this).getRegexString()

  /**
   * AWS tags that contain a key value pair and may be searched by console, command line, or API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A builder for [CfnCustomEntityTypeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contextWords A list of context words.
     * If none of these context words are found within the vicinity of the regular expression the
     * data will not be detected as sensitive data.
     *
     * If no context words are passed only a regular expression is checked.
     */
    public fun contextWords(contextWords: List<String>)

    /**
     * @param contextWords A list of context words.
     * If none of these context words are found within the vicinity of the regular expression the
     * data will not be detected as sensitive data.
     *
     * If no context words are passed only a regular expression is checked.
     */
    public fun contextWords(vararg contextWords: String)

    /**
     * @param name A name for the custom pattern that allows it to be retrieved or deleted later.
     * This name must be unique per AWS account.
     */
    public fun name(name: String)

    /**
     * @param regexString A regular expression string that is used for detecting sensitive data in a
     * custom pattern.
     */
    public fun regexString(regexString: String)

    /**
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     * line, or API.
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnCustomEntityTypeProps.Builder =
        software.amazon.awscdk.services.glue.CfnCustomEntityTypeProps.builder()

    /**
     * @param contextWords A list of context words.
     * If none of these context words are found within the vicinity of the regular expression the
     * data will not be detected as sensitive data.
     *
     * If no context words are passed only a regular expression is checked.
     */
    override fun contextWords(contextWords: List<String>) {
      cdkBuilder.contextWords(contextWords)
    }

    /**
     * @param contextWords A list of context words.
     * If none of these context words are found within the vicinity of the regular expression the
     * data will not be detected as sensitive data.
     *
     * If no context words are passed only a regular expression is checked.
     */
    override fun contextWords(vararg contextWords: String): Unit =
        contextWords(contextWords.toList())

    /**
     * @param name A name for the custom pattern that allows it to be retrieved or deleted later.
     * This name must be unique per AWS account.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param regexString A regular expression string that is used for detecting sensitive data in a
     * custom pattern.
     */
    override fun regexString(regexString: String) {
      cdkBuilder.regexString(regexString)
    }

    /**
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     * line, or API.
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnCustomEntityTypeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.glue.CfnCustomEntityTypeProps,
  ) : CdkObject(cdkObject), CfnCustomEntityTypeProps {
    /**
     * A list of context words.
     *
     * If none of these context words are found within the vicinity of the regular expression the
     * data will not be detected as sensitive data.
     *
     * If no context words are passed only a regular expression is checked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-contextwords)
     */
    override fun contextWords(): List<String> = unwrap(this).getContextWords() ?: emptyList()

    /**
     * A name for the custom pattern that allows it to be retrieved or deleted later.
     *
     * This name must be unique per AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * A regular expression string that is used for detecting sensitive data in a custom pattern.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-regexstring)
     */
    override fun regexString(): String? = unwrap(this).getRegexString()

    /**
     * AWS tags that contain a key value pair and may be searched by console, command line, or API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomEntityTypeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCustomEntityTypeProps):
        CfnCustomEntityTypeProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCustomEntityTypeProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomEntityTypeProps):
        software.amazon.awscdk.services.glue.CfnCustomEntityTypeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnCustomEntityTypeProps
  }
}
