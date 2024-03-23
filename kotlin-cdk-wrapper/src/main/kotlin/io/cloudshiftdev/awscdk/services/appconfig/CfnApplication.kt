@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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

/**
 * The `AWS::AppConfig::Application` resource creates an application.
 *
 * In AWS AppConfig , an application is simply an organizational construct like a folder. This
 * organizational construct has a relationship with some unit of executable code. For example, you
 * could create an application called MyMobileApp to organize and manage configuration data for a
 * mobile application installed by your users.
 *
 * AWS AppConfig requires that you create resources and deploy a configuration in the following
 * order:
 *
 * * Create an application
 * * Create an environment
 * * Create a configuration profile
 * * Create a deployment strategy
 * * Deploy the configuration
 *
 * For more information, see [AWS
 * AppConfig](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in the
 * *AWS AppConfig User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appconfig.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html)
 */
public open class CfnApplication(
  cdkObject: software.amazon.awscdk.services.appconfig.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps,
  ) :
      this(software.amazon.awscdk.services.appconfig.CfnApplication(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnApplicationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationProps(props)
  )

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
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appconfig.CfnApplication.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.appconfig.CfnApplication = wrapped.cdkObject as
        software.amazon.awscdk.services.appconfig.CfnApplication
  }
}
