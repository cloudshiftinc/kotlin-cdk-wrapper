@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface SyslogLogDriverProps : BaseLogDriverProps {
  public fun address(): String? = unwrap(this).getAddress()

  public fun facility(): String? = unwrap(this).getFacility()

  public fun format(): String? = unwrap(this).getFormat()

  public fun tlsCaCert(): String? = unwrap(this).getTlsCaCert()

  public fun tlsCert(): String? = unwrap(this).getTlsCert()

  public fun tlsKey(): String? = unwrap(this).getTlsKey()

  public fun tlsSkipVerify(): Boolean? = unwrap(this).getTlsSkipVerify()

  @CdkDslMarker
  public interface Builder {
    public fun address(address: String)

    public fun env(env: List<String>)

    public fun env(vararg env: String)

    public fun envRegex(envRegex: String)

    public fun facility(facility: String)

    public fun format(format: String)

    public fun labels(labels: List<String>)

    public fun labels(vararg labels: String)

    public fun tag(tag: String)

    public fun tlsCaCert(tlsCaCert: String)

    public fun tlsCert(tlsCert: String)

    public fun tlsKey(tlsKey: String)

    public fun tlsSkipVerify(tlsSkipVerify: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.SyslogLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.SyslogLogDriverProps.builder()

    override fun address(address: String) {
      cdkBuilder.address(address)
    }

    override fun env(env: List<String>) {
      cdkBuilder.env(env)
    }

    override fun env(vararg env: String): Unit = env(env.toList())

    override fun envRegex(envRegex: String) {
      cdkBuilder.envRegex(envRegex)
    }

    override fun facility(facility: String) {
      cdkBuilder.facility(facility)
    }

    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    override fun labels(labels: List<String>) {
      cdkBuilder.labels(labels)
    }

    override fun labels(vararg labels: String): Unit = labels(labels.toList())

    override fun tag(tag: String) {
      cdkBuilder.tag(tag)
    }

    override fun tlsCaCert(tlsCaCert: String) {
      cdkBuilder.tlsCaCert(tlsCaCert)
    }

    override fun tlsCert(tlsCert: String) {
      cdkBuilder.tlsCert(tlsCert)
    }

    override fun tlsKey(tlsKey: String) {
      cdkBuilder.tlsKey(tlsKey)
    }

    override fun tlsSkipVerify(tlsSkipVerify: Boolean) {
      cdkBuilder.tlsSkipVerify(tlsSkipVerify)
    }

    public fun build(): software.amazon.awscdk.services.ecs.SyslogLogDriverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.SyslogLogDriverProps,
  ) : CdkObject(cdkObject), SyslogLogDriverProps {
    override fun address(): String? = unwrap(this).getAddress()

    override fun env(): List<String> = unwrap(this).getEnv() ?: emptyList()

    override fun envRegex(): String? = unwrap(this).getEnvRegex()

    override fun facility(): String? = unwrap(this).getFacility()

    override fun format(): String? = unwrap(this).getFormat()

    override fun labels(): List<String> = unwrap(this).getLabels() ?: emptyList()

    override fun tag(): String? = unwrap(this).getTag()

    override fun tlsCaCert(): String? = unwrap(this).getTlsCaCert()

    override fun tlsCert(): String? = unwrap(this).getTlsCert()

    override fun tlsKey(): String? = unwrap(this).getTlsKey()

    override fun tlsSkipVerify(): Boolean? = unwrap(this).getTlsSkipVerify()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SyslogLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.SyslogLogDriverProps):
        SyslogLogDriverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SyslogLogDriverProps):
        software.amazon.awscdk.services.ecs.SyslogLogDriverProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.SyslogLogDriverProps
  }
}
