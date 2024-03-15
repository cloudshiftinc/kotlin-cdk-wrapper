@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class SplunkLogDriver internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.SplunkLogDriver,
) : LogDriver(cdkObject) {
  public override fun bind(_scope: Construct, _containerDefinition: ContainerDefinition):
      LogDriverConfig = unwrap(this).bind(_scope.let(Construct::unwrap),
      _containerDefinition.let(ContainerDefinition::unwrap)).let(LogDriverConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun caName(caName: String)

    public fun caPath(caPath: String)

    public fun env(env: List<String>)

    public fun env(vararg env: String)

    public fun envRegex(envRegex: String)

    public fun format(format: SplunkLogFormat)

    public fun gzip(gzip: Boolean)

    public fun gzipLevel(gzipLevel: Number)

    public fun index(index: String)

    public fun insecureSkipVerify(insecureSkipVerify: String)

    public fun labels(labels: List<String>)

    public fun labels(vararg labels: String)

    public fun secretToken(secretToken: Secret)

    public fun source(source: String)

    public fun sourceType(sourceType: String)

    public fun tag(tag: String)

    public fun url(url: String)

    public fun verifyConnection(verifyConnection: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.SplunkLogDriver.Builder =
        software.amazon.awscdk.services.ecs.SplunkLogDriver.Builder.create()

    override fun caName(caName: String) {
      cdkBuilder.caName(caName)
    }

    override fun caPath(caPath: String) {
      cdkBuilder.caPath(caPath)
    }

    override fun env(env: List<String>) {
      cdkBuilder.env(env)
    }

    override fun env(vararg env: String): Unit = env(env.toList())

    override fun envRegex(envRegex: String) {
      cdkBuilder.envRegex(envRegex)
    }

    override fun format(format: SplunkLogFormat) {
      cdkBuilder.format(format.let(SplunkLogFormat::unwrap))
    }

    override fun gzip(gzip: Boolean) {
      cdkBuilder.gzip(gzip)
    }

    override fun gzipLevel(gzipLevel: Number) {
      cdkBuilder.gzipLevel(gzipLevel)
    }

    override fun index(index: String) {
      cdkBuilder.index(index)
    }

    override fun insecureSkipVerify(insecureSkipVerify: String) {
      cdkBuilder.insecureSkipVerify(insecureSkipVerify)
    }

    override fun labels(labels: List<String>) {
      cdkBuilder.labels(labels)
    }

    override fun labels(vararg labels: String): Unit = labels(labels.toList())

    override fun secretToken(secretToken: Secret) {
      cdkBuilder.secretToken(secretToken.let(Secret::unwrap))
    }

    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    override fun sourceType(sourceType: String) {
      cdkBuilder.sourceType(sourceType)
    }

    override fun tag(tag: String) {
      cdkBuilder.tag(tag)
    }

    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    override fun verifyConnection(verifyConnection: Boolean) {
      cdkBuilder.verifyConnection(verifyConnection)
    }

    public fun build(): software.amazon.awscdk.services.ecs.SplunkLogDriver = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SplunkLogDriver {
      val builderImpl = BuilderImpl()
      return SplunkLogDriver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.SplunkLogDriver):
        SplunkLogDriver = SplunkLogDriver(cdkObject)

    internal fun unwrap(wrapped: SplunkLogDriver):
        software.amazon.awscdk.services.ecs.SplunkLogDriver = wrapped.cdkObject
  }
}
