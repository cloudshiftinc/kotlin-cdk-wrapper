@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::CertificateManager::Account` resource defines the expiry event configuration that
 * determines the number of days prior to expiry when ACM starts generating EventBridge events.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * CfnAccount cfnAccount = CfnAccount.Builder.create(this, "MyCfnAccount")
 * .expiryEventsConfiguration(ExpiryEventsConfigurationProperty.builder()
 * .daysBeforeExpiry(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-account.html)
 */
public open class CfnAccount internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.certificatemanager.CfnAccount,
) : CfnResource(cdkObject), IInspectable {
  /**
   * ID of the AWS account that owns the certificate.
   */
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  /**
   * Object containing expiration events options associated with an AWS account .
   */
  public open fun expiryEventsConfiguration(): Any = unwrap(this).getExpiryEventsConfiguration()

  /**
   * Object containing expiration events options associated with an AWS account .
   */
  public open fun expiryEventsConfiguration(`value`: IResolvable) {
    unwrap(this).setExpiryEventsConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Object containing expiration events options associated with an AWS account .
   */
  public open fun expiryEventsConfiguration(`value`: ExpiryEventsConfigurationProperty) {
    unwrap(this).setExpiryEventsConfiguration(`value`.let(ExpiryEventsConfigurationProperty::unwrap))
  }

  /**
   * Object containing expiration events options associated with an AWS account .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("43b541d7a8a7127a670a63095163b0fae9efafc0040432ef74e332281800813b")
  public open
      fun expiryEventsConfiguration(`value`: ExpiryEventsConfigurationProperty.Builder.() -> Unit):
      Unit = expiryEventsConfiguration(ExpiryEventsConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.certificatemanager.CfnAccount].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Object containing expiration events options associated with an AWS account .
     *
     * For more information, see
     * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
     * in the API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-account.html#cfn-certificatemanager-account-expiryeventsconfiguration)
     * @param expiryEventsConfiguration Object containing expiration events options associated with
     * an AWS account . 
     */
    public fun expiryEventsConfiguration(expiryEventsConfiguration: IResolvable)

    /**
     * Object containing expiration events options associated with an AWS account .
     *
     * For more information, see
     * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
     * in the API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-account.html#cfn-certificatemanager-account-expiryeventsconfiguration)
     * @param expiryEventsConfiguration Object containing expiration events options associated with
     * an AWS account . 
     */
    public
        fun expiryEventsConfiguration(expiryEventsConfiguration: ExpiryEventsConfigurationProperty)

    /**
     * Object containing expiration events options associated with an AWS account .
     *
     * For more information, see
     * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
     * in the API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-account.html#cfn-certificatemanager-account-expiryeventsconfiguration)
     * @param expiryEventsConfiguration Object containing expiration events options associated with
     * an AWS account . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c0842bef1cd54d71866d8e9087bdbdfc9adda308f78261c7e89717540064bb2")
    public
        fun expiryEventsConfiguration(expiryEventsConfiguration: ExpiryEventsConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.certificatemanager.CfnAccount.Builder =
        software.amazon.awscdk.services.certificatemanager.CfnAccount.Builder.create(scope, id)

    /**
     * Object containing expiration events options associated with an AWS account .
     *
     * For more information, see
     * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
     * in the API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-account.html#cfn-certificatemanager-account-expiryeventsconfiguration)
     * @param expiryEventsConfiguration Object containing expiration events options associated with
     * an AWS account . 
     */
    override fun expiryEventsConfiguration(expiryEventsConfiguration: IResolvable) {
      cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Object containing expiration events options associated with an AWS account .
     *
     * For more information, see
     * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
     * in the API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-account.html#cfn-certificatemanager-account-expiryeventsconfiguration)
     * @param expiryEventsConfiguration Object containing expiration events options associated with
     * an AWS account . 
     */
    override
        fun expiryEventsConfiguration(expiryEventsConfiguration: ExpiryEventsConfigurationProperty) {
      cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration.let(ExpiryEventsConfigurationProperty::unwrap))
    }

    /**
     * Object containing expiration events options associated with an AWS account .
     *
     * For more information, see
     * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
     * in the API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-account.html#cfn-certificatemanager-account-expiryeventsconfiguration)
     * @param expiryEventsConfiguration Object containing expiration events options associated with
     * an AWS account . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c0842bef1cd54d71866d8e9087bdbdfc9adda308f78261c7e89717540064bb2")
    override
        fun expiryEventsConfiguration(expiryEventsConfiguration: ExpiryEventsConfigurationProperty.Builder.() -> Unit):
        Unit =
        expiryEventsConfiguration(ExpiryEventsConfigurationProperty(expiryEventsConfiguration))

    public fun build(): software.amazon.awscdk.services.certificatemanager.CfnAccount =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.certificatemanager.CfnAccount.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccount {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccount(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.CfnAccount):
        CfnAccount = CfnAccount(cdkObject)

    internal fun unwrap(wrapped: CfnAccount):
        software.amazon.awscdk.services.certificatemanager.CfnAccount = wrapped.cdkObject
  }

  /**
   * Object containing expiration events options associated with an AWS account .
   *
   * For more information, see
   * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
   * in the API reference.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
   * ExpiryEventsConfigurationProperty expiryEventsConfigurationProperty =
   * ExpiryEventsConfigurationProperty.builder()
   * .daysBeforeExpiry(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-account-expiryeventsconfiguration.html)
   */
  public interface ExpiryEventsConfigurationProperty {
    /**
     * This option specifies the number of days prior to certificate expiration when ACM starts
     * generating `EventBridge` events.
     *
     * ACM sends one event per day per certificate until the certificate expires. By default,
     * accounts receive events starting 45 days before certificate expiration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-account-expiryeventsconfiguration.html#cfn-certificatemanager-account-expiryeventsconfiguration-daysbeforeexpiry)
     */
    public fun daysBeforeExpiry(): Number? = unwrap(this).getDaysBeforeExpiry()

    /**
     * A builder for [ExpiryEventsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param daysBeforeExpiry This option specifies the number of days prior to certificate
       * expiration when ACM starts generating `EventBridge` events.
       * ACM sends one event per day per certificate until the certificate expires. By default,
       * accounts receive events starting 45 days before certificate expiration.
       */
      public fun daysBeforeExpiry(daysBeforeExpiry: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty.builder()

      /**
       * @param daysBeforeExpiry This option specifies the number of days prior to certificate
       * expiration when ACM starts generating `EventBridge` events.
       * ACM sends one event per day per certificate until the certificate expires. By default,
       * accounts receive events starting 45 days before certificate expiration.
       */
      override fun daysBeforeExpiry(daysBeforeExpiry: Number) {
        cdkBuilder.daysBeforeExpiry(daysBeforeExpiry)
      }

      public fun build():
          software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty,
    ) : CdkObject(cdkObject), ExpiryEventsConfigurationProperty {
      /**
       * This option specifies the number of days prior to certificate expiration when ACM starts
       * generating `EventBridge` events.
       *
       * ACM sends one event per day per certificate until the certificate expires. By default,
       * accounts receive events starting 45 days before certificate expiration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-account-expiryeventsconfiguration.html#cfn-certificatemanager-account-expiryeventsconfiguration-daysbeforeexpiry)
       */
      override fun daysBeforeExpiry(): Number? = unwrap(this).getDaysBeforeExpiry()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExpiryEventsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty):
          ExpiryEventsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ExpiryEventsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExpiryEventsConfigurationProperty):
          software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty
    }
  }
}
