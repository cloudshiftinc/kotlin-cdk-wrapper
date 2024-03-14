package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTargetGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun config(): Any? = unwrap(this).getConfig()

  public open fun config(`value`: IResolvable) {
    unwrap(this).setConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun config(`value`: TargetGroupConfigProperty) {
    unwrap(this).setConfig(`value`.let(TargetGroupConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4f4ccf341b9cd6b69e2d31849bfccd0a3384f2fa5f3ed5cd8ddb782a688d3f71")
  public open fun config(`value`: TargetGroupConfigProperty.Builder.() -> Unit): Unit =
      config(TargetGroupConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun targets(): Any? = unwrap(this).getTargets()

  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable::unwrap))
  }

  public open fun targets(__idx_ac66f0: List<Any>) {
    unwrap(this).setTargets(__idx_ac66f0)
  }

  public open fun targets(vararg __idx_ac66f0: Any): Unit = targets(__idx_ac66f0.toList())

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public fun config(config: IResolvable)

    public fun config(config: TargetGroupConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a926747e7caf939bef4de8eae6a385eecd88dfc04fe41e97fa09b0ef118da04")
    public fun config(config: TargetGroupConfigProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targets(targets: IResolvable)

    public fun targets(targets: List<Any>)

    public fun targets(vararg targets: Any)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnTargetGroup.Builder =
        software.amazon.awscdk.services.vpclattice.CfnTargetGroup.Builder.create(scope, id)

    override fun config(config: IResolvable) {
      cdkBuilder.config(config.let(IResolvable::unwrap))
    }

    override fun config(config: TargetGroupConfigProperty) {
      cdkBuilder.config(config.let(TargetGroupConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a926747e7caf939bef4de8eae6a385eecd88dfc04fe41e97fa09b0ef118da04")
    override fun config(config: TargetGroupConfigProperty.Builder.() -> Unit): Unit =
        config(TargetGroupConfigProperty(config))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnTargetGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTargetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTargetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroup):
        CfnTargetGroup = CfnTargetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnTargetGroup):
        software.amazon.awscdk.services.vpclattice.CfnTargetGroup = wrapped.cdkObject
  }

  public interface HealthCheckConfigProperty {
    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun healthCheckIntervalSeconds(): Number? = unwrap(this).getHealthCheckIntervalSeconds()

    public fun healthCheckTimeoutSeconds(): Number? = unwrap(this).getHealthCheckTimeoutSeconds()

    public fun healthyThresholdCount(): Number? = unwrap(this).getHealthyThresholdCount()

    public fun matcher(): Any? = unwrap(this).getMatcher()

    public fun path(): String? = unwrap(this).getPath()

    public fun port(): Number? = unwrap(this).getPort()

    public fun protocol(): String? = unwrap(this).getProtocol()

    public fun protocolVersion(): String? = unwrap(this).getProtocolVersion()

    public fun unhealthyThresholdCount(): Number? = unwrap(this).getUnhealthyThresholdCount()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number)

      public fun healthCheckTimeoutSeconds(healthCheckTimeoutSeconds: Number)

      public fun healthyThresholdCount(healthyThresholdCount: Number)

      public fun matcher(matcher: IResolvable)

      public fun matcher(matcher: MatcherProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc579f163b5fcc356ab59090b8b20c72ca6c0bbb4901bf927133c145f2f336be")
      public fun matcher(matcher: MatcherProperty.Builder.() -> Unit)

      public fun path(path: String)

      public fun port(port: Number)

      public fun protocol(protocol: String)

      public fun protocolVersion(protocolVersion: String)

      public fun unhealthyThresholdCount(unhealthyThresholdCount: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.HealthCheckConfigProperty.Builder
          =
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.HealthCheckConfigProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number) {
        cdkBuilder.healthCheckIntervalSeconds(healthCheckIntervalSeconds)
      }

      override fun healthCheckTimeoutSeconds(healthCheckTimeoutSeconds: Number) {
        cdkBuilder.healthCheckTimeoutSeconds(healthCheckTimeoutSeconds)
      }

      override fun healthyThresholdCount(healthyThresholdCount: Number) {
        cdkBuilder.healthyThresholdCount(healthyThresholdCount)
      }

      override fun matcher(matcher: IResolvable) {
        cdkBuilder.matcher(matcher.let(IResolvable::unwrap))
      }

      override fun matcher(matcher: MatcherProperty) {
        cdkBuilder.matcher(matcher.let(MatcherProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc579f163b5fcc356ab59090b8b20c72ca6c0bbb4901bf927133c145f2f336be")
      override fun matcher(matcher: MatcherProperty.Builder.() -> Unit): Unit =
          matcher(MatcherProperty(matcher))

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      override fun protocolVersion(protocolVersion: String) {
        cdkBuilder.protocolVersion(protocolVersion)
      }

      override fun unhealthyThresholdCount(unhealthyThresholdCount: Number) {
        cdkBuilder.unhealthyThresholdCount(unhealthyThresholdCount)
      }

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.HealthCheckConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.HealthCheckConfigProperty,
    ) : HealthCheckConfigProperty {
      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun healthCheckIntervalSeconds(): Number? =
          unwrap(this).getHealthCheckIntervalSeconds()

      override fun healthCheckTimeoutSeconds(): Number? =
          unwrap(this).getHealthCheckTimeoutSeconds()

      override fun healthyThresholdCount(): Number? = unwrap(this).getHealthyThresholdCount()

      override fun matcher(): Any? = unwrap(this).getMatcher()

      override fun path(): String? = unwrap(this).getPath()

      override fun port(): Number? = unwrap(this).getPort()

      override fun protocol(): String? = unwrap(this).getProtocol()

      override fun protocolVersion(): String? = unwrap(this).getProtocolVersion()

      override fun unhealthyThresholdCount(): Number? = unwrap(this).getUnhealthyThresholdCount()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroup.HealthCheckConfigProperty):
          HealthCheckConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckConfigProperty):
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.HealthCheckConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MatcherProperty {
    public fun httpCode(): String

    public interface Builder {
      public fun httpCode(httpCode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.MatcherProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.MatcherProperty.builder()

      override fun httpCode(httpCode: String) {
        cdkBuilder.httpCode(httpCode)
      }

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnTargetGroup.MatcherProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.MatcherProperty,
    ) : MatcherProperty {
      override fun httpCode(): String = unwrap(this).getHttpCode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MatcherProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroup.MatcherProperty):
          MatcherProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatcherProperty):
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.MatcherProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TargetProperty {
    public fun id(): String

    public fun port(): Number? = unwrap(this).getPort()

    public interface Builder {
      public fun id(id: String)

      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetProperty,
    ) : TargetProperty {
      override fun id(): String = unwrap(this).getId()

      override fun port(): Number? = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetProperty):
          TargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetProperty):
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TargetGroupConfigProperty {
    public fun healthCheck(): Any? = unwrap(this).getHealthCheck()

    public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    public fun lambdaEventStructureVersion(): String? =
        unwrap(this).getLambdaEventStructureVersion()

    public fun port(): Number? = unwrap(this).getPort()

    public fun protocol(): String? = unwrap(this).getProtocol()

    public fun protocolVersion(): String? = unwrap(this).getProtocolVersion()

    public fun vpcIdentifier(): String? = unwrap(this).getVpcIdentifier()

    public interface Builder {
      public fun healthCheck(healthCheck: IResolvable)

      public fun healthCheck(healthCheck: HealthCheckConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72e53bf3518aa8352dbc54567f9fc646c825ed91bb8f8127cd0a14182046f628")
      public fun healthCheck(healthCheck: HealthCheckConfigProperty.Builder.() -> Unit)

      public fun ipAddressType(ipAddressType: String)

      public fun lambdaEventStructureVersion(lambdaEventStructureVersion: String)

      public fun port(port: Number)

      public fun protocol(protocol: String)

      public fun protocolVersion(protocolVersion: String)

      public fun vpcIdentifier(vpcIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetGroupConfigProperty.Builder
          =
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetGroupConfigProperty.builder()

      override fun healthCheck(healthCheck: IResolvable) {
        cdkBuilder.healthCheck(healthCheck.let(IResolvable::unwrap))
      }

      override fun healthCheck(healthCheck: HealthCheckConfigProperty) {
        cdkBuilder.healthCheck(healthCheck.let(HealthCheckConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72e53bf3518aa8352dbc54567f9fc646c825ed91bb8f8127cd0a14182046f628")
      override fun healthCheck(healthCheck: HealthCheckConfigProperty.Builder.() -> Unit): Unit =
          healthCheck(HealthCheckConfigProperty(healthCheck))

      override fun ipAddressType(ipAddressType: String) {
        cdkBuilder.ipAddressType(ipAddressType)
      }

      override fun lambdaEventStructureVersion(lambdaEventStructureVersion: String) {
        cdkBuilder.lambdaEventStructureVersion(lambdaEventStructureVersion)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      override fun protocolVersion(protocolVersion: String) {
        cdkBuilder.protocolVersion(protocolVersion)
      }

      override fun vpcIdentifier(vpcIdentifier: String) {
        cdkBuilder.vpcIdentifier(vpcIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetGroupConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetGroupConfigProperty,
    ) : TargetGroupConfigProperty {
      override fun healthCheck(): Any? = unwrap(this).getHealthCheck()

      override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

      override fun lambdaEventStructureVersion(): String? =
          unwrap(this).getLambdaEventStructureVersion()

      override fun port(): Number? = unwrap(this).getPort()

      override fun protocol(): String? = unwrap(this).getProtocol()

      override fun protocolVersion(): String? = unwrap(this).getProtocolVersion()

      override fun vpcIdentifier(): String? = unwrap(this).getVpcIdentifier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetGroupConfigProperty):
          TargetGroupConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupConfigProperty):
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetGroupConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
