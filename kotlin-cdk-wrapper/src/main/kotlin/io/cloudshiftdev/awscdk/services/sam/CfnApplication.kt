@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * https://github.com/awslabs/serverless-application-model/blob/master/versions/2016-10-31.md#awsserverlessapplication.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sam.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .location("location")
 * // the properties below are optional
 * .notificationArns(List.of("notificationArns"))
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .timeoutInMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html)
 */
public open class CfnApplication(
  cdkObject: software.amazon.awscdk.services.sam.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps,
  ) :
      this(software.amazon.awscdk.services.sam.CfnApplication(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApplicationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   *
   */
  public open fun location(): Any = unwrap(this).getLocation()

  /**
   *
   */
  public open fun location(`value`: String) {
    unwrap(this).setLocation(`value`)
  }

  /**
   *
   */
  public open fun location(`value`: IResolvable) {
    unwrap(this).setLocation(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun location(`value`: ApplicationLocationProperty) {
    unwrap(this).setLocation(`value`.let(ApplicationLocationProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1dcb31e66d0913c99b516e3e5eda6b247691a5d5e3e9eb879d4eb2c2b6cf4166")
  public open fun location(`value`: ApplicationLocationProperty.Builder.() -> Unit): Unit =
      location(ApplicationLocationProperty(`value`))

  /**
   *
   */
  public open fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
      emptyList()

  /**
   *
   */
  public open fun notificationArns(`value`: List<String>) {
    unwrap(this).setNotificationArns(`value`)
  }

  /**
   *
   */
  public open fun notificationArns(vararg `value`: String): Unit =
      notificationArns(`value`.toList())

  /**
   *
   */
  public open fun parameters(): Any? = unwrap(this).getParameters()

  /**
   *
   */
  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun parameters(`value`: Map<String, String>) {
    unwrap(this).setParameters(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   *
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   *
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   *
   */
  public open fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()

  /**
   *
   */
  public open fun timeoutInMinutes(`value`: Number) {
    unwrap(this).setTimeoutInMinutes(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sam.CfnApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
     * @param location 
     */
    public fun location(location: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
     * @param location 
     */
    public fun location(location: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
     * @param location 
     */
    public fun location(location: ApplicationLocationProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
     * @param location 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52158d726646327e9d094bf58b871f34607bb62eb3f1bdc9c8d0fde88e133c5d")
    public fun location(location: ApplicationLocationProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-notificationarns)
     * @param notificationArns 
     */
    public fun notificationArns(notificationArns: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-notificationarns)
     * @param notificationArns 
     */
    public fun notificationArns(vararg notificationArns: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-parameters)
     * @param parameters 
     */
    public fun parameters(parameters: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-parameters)
     * @param parameters 
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-tags)
     * @param tags 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-timeoutinminutes)
     * @param timeoutInMinutes 
     */
    public fun timeoutInMinutes(timeoutInMinutes: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnApplication.Builder =
        software.amazon.awscdk.services.sam.CfnApplication.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
     * @param location 
     */
    override fun location(location: String) {
      cdkBuilder.location(location)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
     * @param location 
     */
    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
     * @param location 
     */
    override fun location(location: ApplicationLocationProperty) {
      cdkBuilder.location(location.let(ApplicationLocationProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-location)
     * @param location 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52158d726646327e9d094bf58b871f34607bb62eb3f1bdc9c8d0fde88e133c5d")
    override fun location(location: ApplicationLocationProperty.Builder.() -> Unit): Unit =
        location(ApplicationLocationProperty(location))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-notificationarns)
     * @param notificationArns 
     */
    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-notificationarns)
     * @param notificationArns 
     */
    override fun notificationArns(vararg notificationArns: String): Unit =
        notificationArns(notificationArns.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-parameters)
     * @param parameters 
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-parameters)
     * @param parameters 
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-tags)
     * @param tags 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-application.html#cfn-serverless-application-timeoutinminutes)
     * @param timeoutInMinutes 
     */
    override fun timeoutInMinutes(timeoutInMinutes: Number) {
      cdkBuilder.timeoutInMinutes(timeoutInMinutes)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnApplication = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sam.CfnApplication.CFN_RESOURCE_TYPE_NAME

    public val REQUIRED_TRANSFORM: String =
        software.amazon.awscdk.services.sam.CfnApplication.REQUIRED_TRANSFORM

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApplication): CfnApplication
        = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication): software.amazon.awscdk.services.sam.CfnApplication
        = wrapped.cdkObject as software.amazon.awscdk.services.sam.CfnApplication
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sam.*;
   * ApplicationLocationProperty applicationLocationProperty = ApplicationLocationProperty.builder()
   * .applicationId("applicationId")
   * .semanticVersion("semanticVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-application-applicationlocation.html)
   */
  public interface ApplicationLocationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-application-applicationlocation.html#cfn-serverless-application-applicationlocation-applicationid)
     */
    public fun applicationId(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-application-applicationlocation.html#cfn-serverless-application-applicationlocation-semanticversion)
     */
    public fun semanticVersion(): String

    /**
     * A builder for [ApplicationLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applicationId the value to be set. 
       */
      public fun applicationId(applicationId: String)

      /**
       * @param semanticVersion the value to be set. 
       */
      public fun semanticVersion(semanticVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty.builder()

      /**
       * @param applicationId the value to be set. 
       */
      override fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
      }

      /**
       * @param semanticVersion the value to be set. 
       */
      override fun semanticVersion(semanticVersion: String) {
        cdkBuilder.semanticVersion(semanticVersion)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty,
    ) : CdkObject(cdkObject), ApplicationLocationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-application-applicationlocation.html#cfn-serverless-application-applicationlocation-applicationid)
       */
      override fun applicationId(): String = unwrap(this).getApplicationId()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-application-applicationlocation.html#cfn-serverless-application-applicationlocation-semanticversion)
       */
      override fun semanticVersion(): String = unwrap(this).getSemanticVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty):
          ApplicationLocationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ApplicationLocationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationLocationProperty):
          software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.sam.CfnApplication.ApplicationLocationProperty
    }
  }
}
