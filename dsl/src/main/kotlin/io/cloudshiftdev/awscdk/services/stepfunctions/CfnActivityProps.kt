package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnActivityProps {
  /**
   * The name of the activity.
   *
   * A name must *not* contain:
   *
   * * white space
   * * brackets `&lt; &gt; { } [ ]`
   * * wildcard characters `? *`
   * * special characters `" # % \ ^ | ~ ` $ &amp; , ; : /`
   * * control characters ( `U+0000-001F` , `U+007F-009F` )
   *
   * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-name)
   */
  public fun name(): String

  /**
   * The list of tags to add to a resource.
   *
   * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-tags)
   */
  public fun tags(): List<CfnActivity.TagsEntryProperty> =
      unwrap(this).getTags()?.map(CfnActivity.TagsEntryProperty::wrap) ?: emptyList()

  /**
   * A builder for [CfnActivityProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the activity. 
     * A name must *not* contain:
     *
     * * white space
     * * brackets `&lt; &gt; { } [ ]`
     * * wildcard characters `? *`
     * * special characters `" # % \ ^ | ~ ` $ &amp; , ; : /`
     * * control characters ( `U+0000-001F` , `U+007F-009F` )
     *
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     */
    public fun name(name: String)

    /**
     * @param tags The list of tags to add to a resource.
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     */
    public fun tags(tags: List<CfnActivity.TagsEntryProperty>)

    /**
     * @param tags The list of tags to add to a resource.
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     */
    public fun tags(vararg tags: CfnActivity.TagsEntryProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.CfnActivityProps.Builder =
        software.amazon.awscdk.services.stepfunctions.CfnActivityProps.builder()

    /**
     * @param name The name of the activity. 
     * A name must *not* contain:
     *
     * * white space
     * * brackets `&lt; &gt; { } [ ]`
     * * wildcard characters `? *`
     * * special characters `" # % \ ^ | ~ ` $ &amp; , ; : /`
     * * control characters ( `U+0000-001F` , `U+007F-009F` )
     *
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The list of tags to add to a resource.
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     */
    override fun tags(tags: List<CfnActivity.TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(CfnActivity.TagsEntryProperty::unwrap))
    }

    /**
     * @param tags The list of tags to add to a resource.
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     */
    override fun tags(vararg tags: CfnActivity.TagsEntryProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.stepfunctions.CfnActivityProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.CfnActivityProps,
  ) : CdkObject(cdkObject), CfnActivityProps {
    /**
     * The name of the activity.
     *
     * A name must *not* contain:
     *
     * * white space
     * * brackets `&lt; &gt; { } [ ]`
     * * wildcard characters `? *`
     * * special characters `" # % \ ^ | ~ ` $ &amp; , ; : /`
     * * control characters ( `U+0000-001F` , `U+007F-009F` )
     *
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The list of tags to add to a resource.
     *
     * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-tags)
     */
    override fun tags(): List<CfnActivity.TagsEntryProperty> =
        unwrap(this).getTags()?.map(CfnActivity.TagsEntryProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnActivityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnActivityProps):
        CfnActivityProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnActivityProps):
        software.amazon.awscdk.services.stepfunctions.CfnActivityProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.CfnActivityProps
  }
}
