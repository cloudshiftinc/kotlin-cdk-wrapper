@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface SplunkLogDriverProps : BaseLogDriverProps {
  public fun caName(): String? = unwrap(this).getCaName()

  public fun caPath(): String? = unwrap(this).getCaPath()

  public fun format(): SplunkLogFormat? = unwrap(this).getFormat()?.let(SplunkLogFormat::wrap)

  public fun gzip(): Boolean? = unwrap(this).getGzip()

  public fun gzipLevel(): Number? = unwrap(this).getGzipLevel()

  public fun index(): String? = unwrap(this).getIndex()

  public fun insecureSkipVerify(): String? = unwrap(this).getInsecureSkipVerify()

  public fun secretToken(): Secret

  public fun source(): String? = unwrap(this).getSource()

  public fun sourceType(): String? = unwrap(this).getSourceType()

  public fun url(): String

  public fun verifyConnection(): Boolean? = unwrap(this).getVerifyConnection()

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
    private val cdkBuilder: software.amazon.awscdk.services.ecs.SplunkLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.SplunkLogDriverProps.builder()

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

    public fun build(): software.amazon.awscdk.services.ecs.SplunkLogDriverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.SplunkLogDriverProps,
  ) : CdkObject(cdkObject), SplunkLogDriverProps {
    override fun caName(): String? = unwrap(this).getCaName()

    override fun caPath(): String? = unwrap(this).getCaPath()

    override fun env(): List<String> = unwrap(this).getEnv() ?: emptyList()

    override fun envRegex(): String? = unwrap(this).getEnvRegex()

    override fun format(): SplunkLogFormat? = unwrap(this).getFormat()?.let(SplunkLogFormat::wrap)

    override fun gzip(): Boolean? = unwrap(this).getGzip()

    override fun gzipLevel(): Number? = unwrap(this).getGzipLevel()

    override fun index(): String? = unwrap(this).getIndex()

    override fun insecureSkipVerify(): String? = unwrap(this).getInsecureSkipVerify()

    override fun labels(): List<String> = unwrap(this).getLabels() ?: emptyList()

    override fun secretToken(): Secret = unwrap(this).getSecretToken().let(Secret::wrap)

    override fun source(): String? = unwrap(this).getSource()

    override fun sourceType(): String? = unwrap(this).getSourceType()

    override fun tag(): String? = unwrap(this).getTag()

    override fun url(): String = unwrap(this).getUrl()

    override fun verifyConnection(): Boolean? = unwrap(this).getVerifyConnection()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SplunkLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.SplunkLogDriverProps):
        SplunkLogDriverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SplunkLogDriverProps):
        software.amazon.awscdk.services.ecs.SplunkLogDriverProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.SplunkLogDriverProps
  }
}
