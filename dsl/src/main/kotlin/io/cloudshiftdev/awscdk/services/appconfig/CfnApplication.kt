package io.cloudshiftdev.awscdk.services.appconfig

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

public open class CfnApplication internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The application ID.
   */
  public open fun attrApplicationId(): String = unwrap(this).getAttrApplicationId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A description of the application.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the application.
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
   * A name for the application.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A name for the application.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Metadata to assign to the application.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Metadata to assign to the application.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata to assign to the application.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appconfig.CfnApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html#cfn-appconfig-application-description)
     * @param description A description of the application. 
     */
    public fun description(description: String)

    /**
     * A name for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html#cfn-appconfig-application-name)
     * @param name A name for the application. 
     */
    public fun name(name: String)

    /**
     * Metadata to assign to the application.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html#cfn-appconfig-application-tags)
     * @param tags Metadata to assign to the application. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata to assign to the application.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html#cfn-appconfig-application-tags)
     * @param tags Metadata to assign to the application. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.CfnApplication.Builder =
        software.amazon.awscdk.services.appconfig.CfnApplication.Builder.create(scope, id)

    /**
     * A description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html#cfn-appconfig-application-description)
     * @param description A description of the application. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A name for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html#cfn-appconfig-application-name)
     * @param name A name for the application. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Metadata to assign to the application.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html#cfn-appconfig-application-tags)
     * @param tags Metadata to assign to the application. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata to assign to the application.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html#cfn-appconfig-application-tags)
     * @param tags Metadata to assign to the application. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.appconfig.CfnApplication = wrapped.cdkObject
  }
}
