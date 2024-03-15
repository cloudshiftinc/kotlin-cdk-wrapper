@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

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

public open class CfnTopicRuleDestination internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleDestination,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrStatusReason(): String = unwrap(this).getAttrStatusReason()

  public open fun httpUrlProperties(): Any? = unwrap(this).getHttpUrlProperties()

  public open fun httpUrlProperties(`value`: IResolvable) {
    unwrap(this).setHttpUrlProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun httpUrlProperties(`value`: HttpUrlDestinationSummaryProperty) {
    unwrap(this).setHttpUrlProperties(`value`.let(HttpUrlDestinationSummaryProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dbedd54f363089c571d6c38da31564cc71ea4d1fb59d4aae630e54e2aa3ea4ca")
  public open fun httpUrlProperties(`value`: HttpUrlDestinationSummaryProperty.Builder.() -> Unit):
      Unit = httpUrlProperties(HttpUrlDestinationSummaryProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public open fun vpcProperties(): Any? = unwrap(this).getVpcProperties()

  public open fun vpcProperties(`value`: IResolvable) {
    unwrap(this).setVpcProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcProperties(`value`: VpcDestinationPropertiesProperty) {
    unwrap(this).setVpcProperties(`value`.let(VpcDestinationPropertiesProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("28c9d13d2b92dff8c8fe59fde242babb691fcbe69f9aabe0db1d146d6c4222f2")
  public open fun vpcProperties(`value`: VpcDestinationPropertiesProperty.Builder.() -> Unit): Unit
      = vpcProperties(VpcDestinationPropertiesProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun httpUrlProperties(httpUrlProperties: IResolvable)

    public fun httpUrlProperties(httpUrlProperties: HttpUrlDestinationSummaryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc2b764e69a29233aceaba10ec8762b290abc980f6fe1766601f883b8dda6925")
    public
        fun httpUrlProperties(httpUrlProperties: HttpUrlDestinationSummaryProperty.Builder.() -> Unit)

    public fun status(status: String)

    public fun vpcProperties(vpcProperties: IResolvable)

    public fun vpcProperties(vpcProperties: VpcDestinationPropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4395235da5e0270bdf3f463e7b94b4cc592f5dbd0b60c86f1d2ce41030f65ec0")
    public fun vpcProperties(vpcProperties: VpcDestinationPropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnTopicRuleDestination.Builder =
        software.amazon.awscdk.services.iot.CfnTopicRuleDestination.Builder.create(scope, id)

    override fun httpUrlProperties(httpUrlProperties: IResolvable) {
      cdkBuilder.httpUrlProperties(httpUrlProperties.let(IResolvable::unwrap))
    }

    override fun httpUrlProperties(httpUrlProperties: HttpUrlDestinationSummaryProperty) {
      cdkBuilder.httpUrlProperties(httpUrlProperties.let(HttpUrlDestinationSummaryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc2b764e69a29233aceaba10ec8762b290abc980f6fe1766601f883b8dda6925")
    override
        fun httpUrlProperties(httpUrlProperties: HttpUrlDestinationSummaryProperty.Builder.() -> Unit):
        Unit = httpUrlProperties(HttpUrlDestinationSummaryProperty(httpUrlProperties))

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun vpcProperties(vpcProperties: IResolvable) {
      cdkBuilder.vpcProperties(vpcProperties.let(IResolvable::unwrap))
    }

    override fun vpcProperties(vpcProperties: VpcDestinationPropertiesProperty) {
      cdkBuilder.vpcProperties(vpcProperties.let(VpcDestinationPropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4395235da5e0270bdf3f463e7b94b4cc592f5dbd0b60c86f1d2ce41030f65ec0")
    override fun vpcProperties(vpcProperties: VpcDestinationPropertiesProperty.Builder.() -> Unit):
        Unit = vpcProperties(VpcDestinationPropertiesProperty(vpcProperties))

    public fun build(): software.amazon.awscdk.services.iot.CfnTopicRuleDestination =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnTopicRuleDestination.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTopicRuleDestination {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTopicRuleDestination(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleDestination):
        CfnTopicRuleDestination = CfnTopicRuleDestination(cdkObject)

    internal fun unwrap(wrapped: CfnTopicRuleDestination):
        software.amazon.awscdk.services.iot.CfnTopicRuleDestination = wrapped.cdkObject
  }

  public interface VpcDestinationPropertiesProperty {
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    public fun vpcId(): String? = unwrap(this).getVpcId()

    @CdkDslMarker
    public interface Builder {
      public fun roleArn(roleArn: String)

      public fun securityGroups(securityGroups: List<String>)

      public fun securityGroups(vararg securityGroups: String)

      public fun subnetIds(subnetIds: List<String>)

      public fun subnetIds(vararg subnetIds: String)

      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty.builder()

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty,
    ) : CdkObject(cdkObject), VpcDestinationPropertiesProperty {
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

      override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcDestinationPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty):
          VpcDestinationPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcDestinationPropertiesProperty):
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty
    }
  }

  public interface HttpUrlDestinationSummaryProperty {
    public fun confirmationUrl(): String? = unwrap(this).getConfirmationUrl()

    @CdkDslMarker
    public interface Builder {
      public fun confirmationUrl(confirmationUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty.builder()

      override fun confirmationUrl(confirmationUrl: String) {
        cdkBuilder.confirmationUrl(confirmationUrl)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty,
    ) : CdkObject(cdkObject), HttpUrlDestinationSummaryProperty {
      override fun confirmationUrl(): String? = unwrap(this).getConfirmationUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          HttpUrlDestinationSummaryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty):
          HttpUrlDestinationSummaryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpUrlDestinationSummaryProperty):
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty
    }
  }
}
