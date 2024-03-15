@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnComponentProps {
  public fun changeDescription(): String? = unwrap(this).getChangeDescription()

  public fun `data`(): String? = unwrap(this).getData()

  public fun description(): String? = unwrap(this).getDescription()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun name(): String

  public fun platform(): String

  public fun supportedOsVersions(): List<String> = unwrap(this).getSupportedOsVersions() ?:
      emptyList()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun uri(): String? = unwrap(this).getUri()

  public fun version(): String

  @CdkDslMarker
  public interface Builder {
    public fun changeDescription(changeDescription: String)

    public fun `data`(`data`: String)

    public fun description(description: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun name(name: String)

    public fun platform(platform: String)

    public fun supportedOsVersions(supportedOsVersions: List<String>)

    public fun supportedOsVersions(vararg supportedOsVersions: String)

    public fun tags(tags: Map<String, String>)

    public fun uri(uri: String)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnComponentProps.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnComponentProps.builder()

    override fun changeDescription(changeDescription: String) {
      cdkBuilder.changeDescription(changeDescription)
    }

    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    override fun supportedOsVersions(supportedOsVersions: List<String>) {
      cdkBuilder.supportedOsVersions(supportedOsVersions)
    }

    override fun supportedOsVersions(vararg supportedOsVersions: String): Unit =
        supportedOsVersions(supportedOsVersions.toList())

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnComponentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnComponentProps,
  ) : CdkObject(cdkObject), CfnComponentProps {
    override fun changeDescription(): String? = unwrap(this).getChangeDescription()

    override fun `data`(): String? = unwrap(this).getData()

    override fun description(): String? = unwrap(this).getDescription()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun name(): String = unwrap(this).getName()

    override fun platform(): String = unwrap(this).getPlatform()

    override fun supportedOsVersions(): List<String> = unwrap(this).getSupportedOsVersions() ?:
        emptyList()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun uri(): String? = unwrap(this).getUri()

    override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnComponentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnComponentProps):
        CfnComponentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnComponentProps):
        software.amazon.awscdk.services.imagebuilder.CfnComponentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.imagebuilder.CfnComponentProps
  }
}
