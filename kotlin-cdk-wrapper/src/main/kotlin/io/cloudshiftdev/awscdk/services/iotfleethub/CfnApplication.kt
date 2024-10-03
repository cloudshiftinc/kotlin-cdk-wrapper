@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotfleethub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents a Fleet Hub for AWS IoT Device Management web application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotfleethub.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .applicationName("applicationName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .applicationDescription("applicationDescription")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html)
 */
public open class CfnApplication(
  cdkObject: software.amazon.awscdk.services.iotfleethub.CfnApplication,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps,
  ) :
      this(software.amazon.awscdk.services.iotfleethub.CfnApplication(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApplicationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationProps(props)
  )

  /**
   * An optional description of the web application.
   */
  public open fun applicationDescription(): String? = unwrap(this).getApplicationDescription()

  /**
   * An optional description of the web application.
   */
  public open fun applicationDescription(`value`: String) {
    unwrap(this).setApplicationDescription(`value`)
  }

  /**
   * The name of the web application.
   */
  public open fun applicationName(): String = unwrap(this).getApplicationName()

  /**
   * The name of the web application.
   */
  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  /**
   * The ARN of the web application.
   */
  public open fun attrApplicationArn(): String = unwrap(this).getAttrApplicationArn()

  /**
   * The date (in Unix epoch time) when the web application was created.
   */
  public open fun attrApplicationCreationDate(): Number =
      unwrap(this).getAttrApplicationCreationDate()

  /**
   * The unique Id of the web application.
   */
  public open fun attrApplicationId(): String = unwrap(this).getAttrApplicationId()

  /**
   * The date (in Unix epoch time) when the web application was last updated.
   */
  public open fun attrApplicationLastUpdateDate(): Number =
      unwrap(this).getAttrApplicationLastUpdateDate()

  /**
   * The current state of the web application.
   */
  public open fun attrApplicationState(): String = unwrap(this).getAttrApplicationState()

  /**
   * The URL of the web application.
   */
  public open fun attrApplicationUrl(): String = unwrap(this).getAttrApplicationUrl()

  /**
   * A message that explains any failures included in the applicationState response field.
   *
   * This message explains failures in the `CreateApplication` and `DeleteApplication` actions.
   */
  public open fun attrErrorMessage(): String = unwrap(this).getAttrErrorMessage()

  /**
   * The Id of the single sign-on client that you use to authenticate and authorize users on the web
   * application.
   */
  public open fun attrSsoClientId(): String = unwrap(this).getAttrSsoClientId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ARN of the role that the web application assumes when it interacts with AWS IoT Core .
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The ARN of the role that the web application assumes when it interacts with AWS IoT Core .
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A set of key/value pairs that you can use to manage the web application resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A set of key/value pairs that you can use to manage the web application resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A set of key/value pairs that you can use to manage the web application resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotfleethub.CfnApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional description of the web application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-applicationdescription)
     * @param applicationDescription An optional description of the web application. 
     */
    public fun applicationDescription(applicationDescription: String)

    /**
     * The name of the web application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-applicationname)
     * @param applicationName The name of the web application. 
     */
    public fun applicationName(applicationName: String)

    /**
     * The ARN of the role that the web application assumes when it interacts with AWS IoT Core .
     *
     *
     * The name of the role must be in the form `FleetHub_random_string` .
     *
     *
     * Pattern: `^arn:[!-~]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-rolearn)
     * @param roleArn The ARN of the role that the web application assumes when it interacts with
     * AWS IoT Core . 
     */
    public fun roleArn(roleArn: String)

    /**
     * A set of key/value pairs that you can use to manage the web application resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-tags)
     * @param tags A set of key/value pairs that you can use to manage the web application resource.
     * 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A set of key/value pairs that you can use to manage the web application resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-tags)
     * @param tags A set of key/value pairs that you can use to manage the web application resource.
     * 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleethub.CfnApplication.Builder =
        software.amazon.awscdk.services.iotfleethub.CfnApplication.Builder.create(scope, id)

    /**
     * An optional description of the web application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-applicationdescription)
     * @param applicationDescription An optional description of the web application. 
     */
    override fun applicationDescription(applicationDescription: String) {
      cdkBuilder.applicationDescription(applicationDescription)
    }

    /**
     * The name of the web application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-applicationname)
     * @param applicationName The name of the web application. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * The ARN of the role that the web application assumes when it interacts with AWS IoT Core .
     *
     *
     * The name of the role must be in the form `FleetHub_random_string` .
     *
     *
     * Pattern: `^arn:[!-~]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-rolearn)
     * @param roleArn The ARN of the role that the web application assumes when it interacts with
     * AWS IoT Core . 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * A set of key/value pairs that you can use to manage the web application resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-tags)
     * @param tags A set of key/value pairs that you can use to manage the web application resource.
     * 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A set of key/value pairs that you can use to manage the web application resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-tags)
     * @param tags A set of key/value pairs that you can use to manage the web application resource.
     * 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleethub.CfnApplication =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotfleethub.CfnApplication.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotfleethub.CfnApplication):
        CfnApplication = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication):
        software.amazon.awscdk.services.iotfleethub.CfnApplication = wrapped.cdkObject as
        software.amazon.awscdk.services.iotfleethub.CfnApplication
  }
}
