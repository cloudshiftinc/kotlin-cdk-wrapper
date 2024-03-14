package io.cloudshiftdev.awscdk.services.b2bi

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProfile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.b2bi.CfnProfile,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * Returns the timestamp for creation date and time of the profile.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * Returns the name of the logging group.
   */
  public open fun attrLogGroupName(): String = unwrap(this).getAttrLogGroupName()

  /**
   * Returns the timestamp that identifies the most recent date and time that the profile was
   * modified.
   */
  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  /**
   * Returns an Amazon Resource Name (ARN) for the profile.
   */
  public open fun attrProfileArn(): String = unwrap(this).getAttrProfileArn()

  /**
   *
   */
  public open fun attrProfileId(): String = unwrap(this).getAttrProfileId()

  /**
   * Returns the name for the business associated with this profile.
   */
  public open fun businessName(): String = unwrap(this).getBusinessName()

  /**
   * Returns the name for the business associated with this profile.
   */
  public open fun businessName(`value`: String) {
    unwrap(this).setBusinessName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   *
   */
  public open fun email(): String? = unwrap(this).getEmail()

  /**
   *
   */
  public open fun email(`value`: String) {
    unwrap(this).setEmail(`value`)
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
   * Specifies whether or not logging is enabled for this profile.
   */
  public open fun logging(): String = unwrap(this).getLogging()

  /**
   * Specifies whether or not logging is enabled for this profile.
   */
  public open fun logging(`value`: String) {
    unwrap(this).setLogging(`value`)
  }

  /**
   * Returns the display name for profile.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Returns the display name for profile.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   *
   */
  public open fun phone(): String = unwrap(this).getPhone()

  /**
   *
   */
  public open fun phone(`value`: String) {
    unwrap(this).setPhone(`value`)
  }

  /**
   * A key-value pair for a specific profile.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A key-value pair for a specific profile.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * A key-value pair for a specific profile.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.b2bi.CfnProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Returns the name for the business associated with this profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-businessname)
     * @param businessName Returns the name for the business associated with this profile. 
     */
    public fun businessName(businessName: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-email)
     * @param email 
     */
    public fun email(email: String)

    /**
     * Specifies whether or not logging is enabled for this profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-logging)
     * @param logging Specifies whether or not logging is enabled for this profile. 
     */
    public fun logging(logging: String)

    /**
     * Returns the display name for profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-name)
     * @param name Returns the display name for profile. 
     */
    public fun name(name: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-phone)
     * @param phone 
     */
    public fun phone(phone: String)

    /**
     * A key-value pair for a specific profile.
     *
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-tags)
     * @param tags A key-value pair for a specific profile. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A key-value pair for a specific profile.
     *
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-tags)
     * @param tags A key-value pair for a specific profile. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.b2bi.CfnProfile.Builder =
        software.amazon.awscdk.services.b2bi.CfnProfile.Builder.create(scope, id)

    /**
     * Returns the name for the business associated with this profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-businessname)
     * @param businessName Returns the name for the business associated with this profile. 
     */
    override fun businessName(businessName: String) {
      cdkBuilder.businessName(businessName)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-email)
     * @param email 
     */
    override fun email(email: String) {
      cdkBuilder.email(email)
    }

    /**
     * Specifies whether or not logging is enabled for this profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-logging)
     * @param logging Specifies whether or not logging is enabled for this profile. 
     */
    override fun logging(logging: String) {
      cdkBuilder.logging(logging)
    }

    /**
     * Returns the display name for profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-name)
     * @param name Returns the display name for profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-phone)
     * @param phone 
     */
    override fun phone(phone: String) {
      cdkBuilder.phone(phone)
    }

    /**
     * A key-value pair for a specific profile.
     *
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-tags)
     * @param tags A key-value pair for a specific profile. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A key-value pair for a specific profile.
     *
     * Tags are metadata that you can use to search for and group capabilities for various purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-b2bi-profile.html#cfn-b2bi-profile-tags)
     * @param tags A key-value pair for a specific profile. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.b2bi.CfnProfile = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnProfile): CfnProfile =
        CfnProfile(cdkObject)

    internal fun unwrap(wrapped: CfnProfile): software.amazon.awscdk.services.b2bi.CfnProfile =
        wrapped.cdkObject
  }
}
