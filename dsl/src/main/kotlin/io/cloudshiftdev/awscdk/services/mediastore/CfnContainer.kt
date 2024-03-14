package io.cloudshiftdev.awscdk.services.mediastore

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

public open class CfnContainer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediastore.CfnContainer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessLoggingEnabled(): Any? = unwrap(this).getAccessLoggingEnabled()

  public open fun accessLoggingEnabled(`value`: Boolean) {
    unwrap(this).setAccessLoggingEnabled(`value`)
  }

  public open fun accessLoggingEnabled(`value`: IResolvable) {
    unwrap(this).setAccessLoggingEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun containerName(): String = unwrap(this).getContainerName()

  public open fun containerName(`value`: String) {
    unwrap(this).setContainerName(`value`)
  }

  public open fun corsPolicy(): Any? = unwrap(this).getCorsPolicy()

  public open fun corsPolicy(`value`: IResolvable) {
    unwrap(this).setCorsPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun corsPolicy(__idx_ac66f0: List<Any>) {
    unwrap(this).setCorsPolicy(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lifecyclePolicy(): String? = unwrap(this).getLifecyclePolicy()

  public open fun lifecyclePolicy(`value`: String) {
    unwrap(this).setLifecyclePolicy(`value`)
  }

  public open fun metricPolicy(): Any? = unwrap(this).getMetricPolicy()

  public open fun metricPolicy(`value`: IResolvable) {
    unwrap(this).setMetricPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun metricPolicy(`value`: MetricPolicyProperty) {
    unwrap(this).setMetricPolicy(`value`.let(MetricPolicyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("30ad567ccaa3199b28cca233862d91eadd4ede572bd2261c65ad626c00b0c6e3")
  public open fun metricPolicy(`value`: MetricPolicyProperty.Builder.() -> Unit): Unit =
      metricPolicy(MetricPolicyProperty(`value`))

  public open fun policy(): String? = unwrap(this).getPolicy()

  public open fun policy(`value`: String) {
    unwrap(this).setPolicy(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun accessLoggingEnabled(accessLoggingEnabled: Boolean) {
    }

    public fun accessLoggingEnabled(accessLoggingEnabled: IResolvable) {
    }

    public fun containerName(containerName: String) {
    }

    public fun corsPolicy(corsPolicy: IResolvable) {
    }

    public fun corsPolicy(corsPolicy: List<Any>) {
    }

    public fun lifecyclePolicy(lifecyclePolicy: String) {
    }

    public fun metricPolicy(metricPolicy: IResolvable) {
    }

    public fun metricPolicy(metricPolicy: MetricPolicyProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e37cc4c8bc6c719112c42e2773256cdec9ad280b8934023a1763cc5845c8f29a")
    public fun metricPolicy(metricPolicy: MetricPolicyProperty.Builder.() -> Unit) {
    }

    public fun policy(policy: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediastore.CfnContainer.Builder =
        software.amazon.awscdk.services.mediastore.CfnContainer.Builder.create(scope, id)

    public override fun accessLoggingEnabled(accessLoggingEnabled: Boolean) {
      cdkBuilder.accessLoggingEnabled(accessLoggingEnabled)
    }

    public override fun accessLoggingEnabled(accessLoggingEnabled: IResolvable) {
      cdkBuilder.accessLoggingEnabled(accessLoggingEnabled.let(IResolvable::unwrap))
    }

    public override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    public override fun corsPolicy(corsPolicy: IResolvable) {
      cdkBuilder.corsPolicy(corsPolicy.let(IResolvable::unwrap))
    }

    public override fun corsPolicy(corsPolicy: List<Any>) {
      cdkBuilder.corsPolicy(corsPolicy)
    }

    public override fun lifecyclePolicy(lifecyclePolicy: String) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy)
    }

    public override fun metricPolicy(metricPolicy: IResolvable) {
      cdkBuilder.metricPolicy(metricPolicy.let(IResolvable::unwrap))
    }

    public override fun metricPolicy(metricPolicy: MetricPolicyProperty) {
      cdkBuilder.metricPolicy(metricPolicy.let(MetricPolicyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e37cc4c8bc6c719112c42e2773256cdec9ad280b8934023a1763cc5845c8f29a")
    public override fun metricPolicy(metricPolicy: MetricPolicyProperty.Builder.() -> Unit): Unit =
        metricPolicy(MetricPolicyProperty(metricPolicy))

    public override fun policy(policy: String) {
      cdkBuilder.policy(policy)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.mediastore.CfnContainer = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContainer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContainer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediastore.CfnContainer):
        CfnContainer = CfnContainer(cdkObject)

    internal fun unwrap(wrapped: CfnContainer):
        software.amazon.awscdk.services.mediastore.CfnContainer = wrapped.cdkObject
  }

  public interface MetricPolicyRuleProperty {
    public fun objectGroup(): String

    public fun objectGroupName(): String

    public interface Builder {
      public fun objectGroup(objectGroup: String) {
      }

      public fun objectGroupName(objectGroupName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyRuleProperty.Builder =
          software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyRuleProperty.builder()

      public override fun objectGroup(objectGroup: String) {
        cdkBuilder.objectGroup(objectGroup)
      }

      public override fun objectGroupName(objectGroupName: String) {
        cdkBuilder.objectGroupName(objectGroupName)
      }

      public fun build():
          software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyRuleProperty,
    ) : MetricPolicyRuleProperty {
      public override fun objectGroup(): String = unwrap(this).getObjectGroup()

      public override fun objectGroupName(): String = unwrap(this).getObjectGroupName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricPolicyRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyRuleProperty):
          MetricPolicyRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricPolicyRuleProperty):
          software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyRuleProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetricPolicyProperty {
    public fun containerLevelMetrics(): String

    public fun metricPolicyRules(): Any? = unwrap(this).getMetricPolicyRules()

    public interface Builder {
      public fun containerLevelMetrics(containerLevelMetrics: String) {
      }

      public fun metricPolicyRules(metricPolicyRules: IResolvable) {
      }

      public fun metricPolicyRules(metricPolicyRules: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyProperty.Builder =
          software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyProperty.builder()

      public override fun containerLevelMetrics(containerLevelMetrics: String) {
        cdkBuilder.containerLevelMetrics(containerLevelMetrics)
      }

      public override fun metricPolicyRules(metricPolicyRules: IResolvable) {
        cdkBuilder.metricPolicyRules(metricPolicyRules.let(IResolvable::unwrap))
      }

      public override fun metricPolicyRules(metricPolicyRules: List<Any>) {
        cdkBuilder.metricPolicyRules(metricPolicyRules)
      }

      public fun build():
          software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyProperty,
    ) : MetricPolicyProperty {
      public override fun containerLevelMetrics(): String = unwrap(this).getContainerLevelMetrics()

      public override fun metricPolicyRules(): Any? = unwrap(this).getMetricPolicyRules()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyProperty):
          MetricPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricPolicyProperty):
          software.amazon.awscdk.services.mediastore.CfnContainer.MetricPolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CorsRuleProperty {
    public fun allowedHeaders(): List<String> = unwrap(this).getAllowedHeaders() ?: emptyList()

    public fun allowedMethods(): List<String> = unwrap(this).getAllowedMethods() ?: emptyList()

    public fun allowedOrigins(): List<String> = unwrap(this).getAllowedOrigins() ?: emptyList()

    public fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

    public fun maxAgeSeconds(): Number? = unwrap(this).getMaxAgeSeconds()

    public interface Builder {
      public fun allowedHeaders(allowedHeaders: List<String>) {
      }

      public fun allowedMethods(allowedMethods: List<String>) {
      }

      public fun allowedOrigins(allowedOrigins: List<String>) {
      }

      public fun exposeHeaders(exposeHeaders: List<String>) {
      }

      public fun maxAgeSeconds(maxAgeSeconds: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediastore.CfnContainer.CorsRuleProperty.Builder =
          software.amazon.awscdk.services.mediastore.CfnContainer.CorsRuleProperty.builder()

      public override fun allowedHeaders(allowedHeaders: List<String>) {
        cdkBuilder.allowedHeaders(allowedHeaders)
      }

      public override fun allowedMethods(allowedMethods: List<String>) {
        cdkBuilder.allowedMethods(allowedMethods)
      }

      public override fun allowedOrigins(allowedOrigins: List<String>) {
        cdkBuilder.allowedOrigins(allowedOrigins)
      }

      public override fun exposeHeaders(exposeHeaders: List<String>) {
        cdkBuilder.exposeHeaders(exposeHeaders)
      }

      public override fun maxAgeSeconds(maxAgeSeconds: Number) {
        cdkBuilder.maxAgeSeconds(maxAgeSeconds)
      }

      public fun build(): software.amazon.awscdk.services.mediastore.CfnContainer.CorsRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediastore.CfnContainer.CorsRuleProperty,
    ) : CorsRuleProperty {
      public override fun allowedHeaders(): List<String> = unwrap(this).getAllowedHeaders() ?:
          emptyList()

      public override fun allowedMethods(): List<String> = unwrap(this).getAllowedMethods() ?:
          emptyList()

      public override fun allowedOrigins(): List<String> = unwrap(this).getAllowedOrigins() ?:
          emptyList()

      public override fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?:
          emptyList()

      public override fun maxAgeSeconds(): Number? = unwrap(this).getMaxAgeSeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CorsRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediastore.CfnContainer.CorsRuleProperty):
          CorsRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CorsRuleProperty):
          software.amazon.awscdk.services.mediastore.CfnContainer.CorsRuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
