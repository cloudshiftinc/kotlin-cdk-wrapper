package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnContactListProps {
  /**
   * The name of the contact list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-contactlistname)
   */
  public fun contactListName(): String? = unwrap(this).getContactListName()

  /**
   * A description of what the contact list is about.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The tags associated with a contact list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An interest group, theme, or label within a list.
   *
   * A contact list can have multiple topics.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-topics)
   */
  public fun topics(): Any? = unwrap(this).getTopics()

  /**
   * A builder for [CfnContactListProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contactListName The name of the contact list.
     */
    public fun contactListName(contactListName: String)

    /**
     * @param description A description of what the contact list is about.
     */
    public fun description(description: String)

    /**
     * @param tags The tags associated with a contact list.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags associated with a contact list.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param topics An interest group, theme, or label within a list.
     * A contact list can have multiple topics.
     */
    public fun topics(topics: IResolvable)

    /**
     * @param topics An interest group, theme, or label within a list.
     * A contact list can have multiple topics.
     */
    public fun topics(topics: List<Any>)

    /**
     * @param topics An interest group, theme, or label within a list.
     * A contact list can have multiple topics.
     */
    public fun topics(vararg topics: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnContactListProps.Builder =
        software.amazon.awscdk.services.ses.CfnContactListProps.builder()

    /**
     * @param contactListName The name of the contact list.
     */
    override fun contactListName(contactListName: String) {
      cdkBuilder.contactListName(contactListName)
    }

    /**
     * @param description A description of what the contact list is about.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param tags The tags associated with a contact list.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags associated with a contact list.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param topics An interest group, theme, or label within a list.
     * A contact list can have multiple topics.
     */
    override fun topics(topics: IResolvable) {
      cdkBuilder.topics(topics.let(IResolvable::unwrap))
    }

    /**
     * @param topics An interest group, theme, or label within a list.
     * A contact list can have multiple topics.
     */
    override fun topics(topics: List<Any>) {
      cdkBuilder.topics(topics)
    }

    /**
     * @param topics An interest group, theme, or label within a list.
     * A contact list can have multiple topics.
     */
    override fun topics(vararg topics: Any): Unit = topics(topics.toList())

    public fun build(): software.amazon.awscdk.services.ses.CfnContactListProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.CfnContactListProps,
  ) : CdkObject(cdkObject), CfnContactListProps {
    /**
     * The name of the contact list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-contactlistname)
     */
    override fun contactListName(): String? = unwrap(this).getContactListName()

    /**
     * A description of what the contact list is about.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The tags associated with a contact list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * An interest group, theme, or label within a list.
     *
     * A contact list can have multiple topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-contactlist.html#cfn-ses-contactlist-topics)
     */
    override fun topics(): Any? = unwrap(this).getTopics()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContactListProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnContactListProps):
        CfnContactListProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContactListProps):
        software.amazon.awscdk.services.ses.CfnContactListProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.CfnContactListProps
  }
}
