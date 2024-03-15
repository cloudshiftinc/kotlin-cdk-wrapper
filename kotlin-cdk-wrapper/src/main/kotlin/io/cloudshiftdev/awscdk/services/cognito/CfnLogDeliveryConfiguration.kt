@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLogDeliveryConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logConfigurations(): Any? = unwrap(this).getLogConfigurations()

  public open fun logConfigurations(`value`: IResolvable) {
    unwrap(this).setLogConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun logConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setLogConfigurations(__idx_ac66f0)
  }

  public open fun logConfigurations(vararg __idx_ac66f0: Any): Unit =
      logConfigurations(__idx_ac66f0.toList())

  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun logConfigurations(logConfigurations: IResolvable)

    public fun logConfigurations(logConfigurations: List<Any>)

    public fun logConfigurations(vararg logConfigurations: Any)

    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.Builder =
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.Builder.create(scope,
        id)

    override fun logConfigurations(logConfigurations: IResolvable) {
      cdkBuilder.logConfigurations(logConfigurations.let(IResolvable::unwrap))
    }

    override fun logConfigurations(logConfigurations: List<Any>) {
      cdkBuilder.logConfigurations(logConfigurations)
    }

    override fun logConfigurations(vararg logConfigurations: Any): Unit =
        logConfigurations(logConfigurations.toList())

    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLogDeliveryConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLogDeliveryConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration):
        CfnLogDeliveryConfiguration = CfnLogDeliveryConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnLogDeliveryConfiguration):
        software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration = wrapped.cdkObject
  }

  public interface LogConfigurationProperty {
    public fun cloudWatchLogsConfiguration(): Any? = unwrap(this).getCloudWatchLogsConfiguration()

    public fun eventSource(): String? = unwrap(this).getEventSource()

    public fun logLevel(): String? = unwrap(this).getLogLevel()

    @CdkDslMarker
    public interface Builder {
      public fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: IResolvable)

      public
          fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: CloudWatchLogsConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c72dbd13231f18ec304bbe35965e946d533d687a2d96901fa93fa1a35c6cc0d")
      public
          fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: CloudWatchLogsConfigurationProperty.Builder.() -> Unit)

      public fun eventSource(eventSource: String)

      public fun logLevel(logLevel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty.builder()

      override fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: IResolvable) {
        cdkBuilder.cloudWatchLogsConfiguration(cloudWatchLogsConfiguration.let(IResolvable::unwrap))
      }

      override
          fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: CloudWatchLogsConfigurationProperty) {
        cdkBuilder.cloudWatchLogsConfiguration(cloudWatchLogsConfiguration.let(CloudWatchLogsConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c72dbd13231f18ec304bbe35965e946d533d687a2d96901fa93fa1a35c6cc0d")
      override
          fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: CloudWatchLogsConfigurationProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLogsConfiguration(CloudWatchLogsConfigurationProperty(cloudWatchLogsConfiguration))

      override fun eventSource(eventSource: String) {
        cdkBuilder.eventSource(eventSource)
      }

      override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty,
    ) : CdkObject(cdkObject), LogConfigurationProperty {
      override fun cloudWatchLogsConfiguration(): Any? =
          unwrap(this).getCloudWatchLogsConfiguration()

      override fun eventSource(): String? = unwrap(this).getEventSource()

      override fun logLevel(): String? = unwrap(this).getLogLevel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty):
          LogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.LogConfigurationProperty
    }
  }

  public interface CloudWatchLogsConfigurationProperty {
    public fun logGroupArn(): String? = unwrap(this).getLogGroupArn()

    @CdkDslMarker
    public interface Builder {
      public fun logGroupArn(logGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty.builder()

      override fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty,
    ) : CdkObject(cdkObject), CloudWatchLogsConfigurationProperty {
      override fun logGroupArn(): String? = unwrap(this).getLogGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchLogsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty):
          CloudWatchLogsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsConfigurationProperty):
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty
    }
  }
}
