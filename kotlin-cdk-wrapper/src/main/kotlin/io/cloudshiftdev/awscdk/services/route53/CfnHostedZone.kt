@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
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

public open class CfnHostedZone internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.route53.CfnHostedZone,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrNameServers(): List<String> = unwrap(this).getAttrNameServers()

  public open fun hostedZoneConfig(): Any? = unwrap(this).getHostedZoneConfig()

  public open fun hostedZoneConfig(`value`: IResolvable) {
    unwrap(this).setHostedZoneConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun hostedZoneConfig(`value`: HostedZoneConfigProperty) {
    unwrap(this).setHostedZoneConfig(`value`.let(HostedZoneConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c15f2703746639fc60927ce1df23afdfd15f141ac6d056ae04695933b407474e")
  public open fun hostedZoneConfig(`value`: HostedZoneConfigProperty.Builder.() -> Unit): Unit =
      hostedZoneConfig(HostedZoneConfigProperty(`value`))

  public open fun hostedZoneTagsRaw(): List<HostedZoneTagProperty> =
      unwrap(this).getHostedZoneTagsRaw()?.map(HostedZoneTagProperty::wrap) ?: emptyList()

  public open fun hostedZoneTagsRaw(`value`: List<HostedZoneTagProperty>) {
    unwrap(this).setHostedZoneTagsRaw(`value`.map(HostedZoneTagProperty::unwrap))
  }

  public open fun hostedZoneTagsRaw(vararg `value`: HostedZoneTagProperty): Unit =
      hostedZoneTagsRaw(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun queryLoggingConfig(): Any? = unwrap(this).getQueryLoggingConfig()

  public open fun queryLoggingConfig(`value`: IResolvable) {
    unwrap(this).setQueryLoggingConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun queryLoggingConfig(`value`: QueryLoggingConfigProperty) {
    unwrap(this).setQueryLoggingConfig(`value`.let(QueryLoggingConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e2ebcb9eb303e4cc4b602fbc39a41a00acbb69e169ae626b2822b86689ef91bc")
  public open fun queryLoggingConfig(`value`: QueryLoggingConfigProperty.Builder.() -> Unit): Unit =
      queryLoggingConfig(QueryLoggingConfigProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun vpcs(): Any? = unwrap(this).getVpcs()

  public open fun vpcs(`value`: IResolvable) {
    unwrap(this).setVpcs(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcs(__idx_ac66f0: List<Any>) {
    unwrap(this).setVpcs(__idx_ac66f0)
  }

  public open fun vpcs(vararg __idx_ac66f0: Any): Unit = vpcs(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun hostedZoneConfig(hostedZoneConfig: IResolvable)

    public fun hostedZoneConfig(hostedZoneConfig: HostedZoneConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf6d2fd2ccbcb97d5d9641544ccb5faf470a34337d7035c5365a3729b521b0c3")
    public fun hostedZoneConfig(hostedZoneConfig: HostedZoneConfigProperty.Builder.() -> Unit)

    public fun hostedZoneTags(hostedZoneTags: List<HostedZoneTagProperty>)

    public fun hostedZoneTags(vararg hostedZoneTags: HostedZoneTagProperty)

    public fun name(name: String)

    public fun queryLoggingConfig(queryLoggingConfig: IResolvable)

    public fun queryLoggingConfig(queryLoggingConfig: QueryLoggingConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3b0b16f06ec058da9c9f85788ccf6a4e7407a109dfb778d25b1f2338ce86c99")
    public fun queryLoggingConfig(queryLoggingConfig: QueryLoggingConfigProperty.Builder.() -> Unit)

    public fun vpcs(vpcs: IResolvable)

    public fun vpcs(vpcs: List<Any>)

    public fun vpcs(vararg vpcs: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CfnHostedZone.Builder =
        software.amazon.awscdk.services.route53.CfnHostedZone.Builder.create(scope, id)

    override fun hostedZoneConfig(hostedZoneConfig: IResolvable) {
      cdkBuilder.hostedZoneConfig(hostedZoneConfig.let(IResolvable::unwrap))
    }

    override fun hostedZoneConfig(hostedZoneConfig: HostedZoneConfigProperty) {
      cdkBuilder.hostedZoneConfig(hostedZoneConfig.let(HostedZoneConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf6d2fd2ccbcb97d5d9641544ccb5faf470a34337d7035c5365a3729b521b0c3")
    override fun hostedZoneConfig(hostedZoneConfig: HostedZoneConfigProperty.Builder.() -> Unit):
        Unit = hostedZoneConfig(HostedZoneConfigProperty(hostedZoneConfig))

    override fun hostedZoneTags(hostedZoneTags: List<HostedZoneTagProperty>) {
      cdkBuilder.hostedZoneTags(hostedZoneTags.map(HostedZoneTagProperty::unwrap))
    }

    override fun hostedZoneTags(vararg hostedZoneTags: HostedZoneTagProperty): Unit =
        hostedZoneTags(hostedZoneTags.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun queryLoggingConfig(queryLoggingConfig: IResolvable) {
      cdkBuilder.queryLoggingConfig(queryLoggingConfig.let(IResolvable::unwrap))
    }

    override fun queryLoggingConfig(queryLoggingConfig: QueryLoggingConfigProperty) {
      cdkBuilder.queryLoggingConfig(queryLoggingConfig.let(QueryLoggingConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3b0b16f06ec058da9c9f85788ccf6a4e7407a109dfb778d25b1f2338ce86c99")
    override
        fun queryLoggingConfig(queryLoggingConfig: QueryLoggingConfigProperty.Builder.() -> Unit):
        Unit = queryLoggingConfig(QueryLoggingConfigProperty(queryLoggingConfig))

    override fun vpcs(vpcs: IResolvable) {
      cdkBuilder.vpcs(vpcs.let(IResolvable::unwrap))
    }

    override fun vpcs(vpcs: List<Any>) {
      cdkBuilder.vpcs(vpcs)
    }

    override fun vpcs(vararg vpcs: Any): Unit = vpcs(vpcs.toList())

    public fun build(): software.amazon.awscdk.services.route53.CfnHostedZone = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53.CfnHostedZone.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHostedZone {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHostedZone(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnHostedZone):
        CfnHostedZone = CfnHostedZone(cdkObject)

    internal fun unwrap(wrapped: CfnHostedZone):
        software.amazon.awscdk.services.route53.CfnHostedZone = wrapped.cdkObject
  }

  public interface QueryLoggingConfigProperty {
    public fun cloudWatchLogsLogGroupArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty.Builder =
          software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty.builder()

      override fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String) {
        cdkBuilder.cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty,
    ) : CdkObject(cdkObject), QueryLoggingConfigProperty {
      override fun cloudWatchLogsLogGroupArn(): String = unwrap(this).getCloudWatchLogsLogGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryLoggingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty):
          QueryLoggingConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryLoggingConfigProperty):
          software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty
    }
  }

  public interface VPCProperty {
    public fun vpcId(): String

    public fun vpcRegion(): String

    @CdkDslMarker
    public interface Builder {
      public fun vpcId(vpcId: String)

      public fun vpcRegion(vpcRegion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty.Builder =
          software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty.builder()

      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      override fun vpcRegion(vpcRegion: String) {
        cdkBuilder.vpcRegion(vpcRegion)
      }

      public fun build(): software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty,
    ) : CdkObject(cdkObject), VPCProperty {
      override fun vpcId(): String = unwrap(this).getVpcId()

      override fun vpcRegion(): String = unwrap(this).getVpcRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VPCProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty):
          VPCProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VPCProperty):
          software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.route53.CfnHostedZone.VPCProperty
    }
  }

  public interface HostedZoneTagProperty {
    public fun key(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty.Builder =
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty,
    ) : CdkObject(cdkObject), HostedZoneTagProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HostedZoneTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty):
          HostedZoneTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HostedZoneTagProperty):
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneTagProperty
    }
  }

  public interface HostedZoneConfigProperty {
    public fun comment(): String? = unwrap(this).getComment()

    @CdkDslMarker
    public interface Builder {
      public fun comment(comment: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty.Builder =
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty.builder()

      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      public fun build():
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty,
    ) : CdkObject(cdkObject), HostedZoneConfigProperty {
      override fun comment(): String? = unwrap(this).getComment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HostedZoneConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty):
          HostedZoneConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HostedZoneConfigProperty):
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty
    }
  }
}
