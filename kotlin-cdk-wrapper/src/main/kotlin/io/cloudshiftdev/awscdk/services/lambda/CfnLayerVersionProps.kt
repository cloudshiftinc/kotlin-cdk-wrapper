@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnLayerVersionProps {
  public fun compatibleArchitectures(): List<String> = unwrap(this).getCompatibleArchitectures() ?:
      emptyList()

  public fun compatibleRuntimes(): List<String> = unwrap(this).getCompatibleRuntimes() ?:
      emptyList()

  public fun content(): Any

  public fun description(): String? = unwrap(this).getDescription()

  public fun layerName(): String? = unwrap(this).getLayerName()

  public fun licenseInfo(): String? = unwrap(this).getLicenseInfo()

  @CdkDslMarker
  public interface Builder {
    public fun compatibleArchitectures(compatibleArchitectures: List<String>)

    public fun compatibleArchitectures(vararg compatibleArchitectures: String)

    public fun compatibleRuntimes(compatibleRuntimes: List<String>)

    public fun compatibleRuntimes(vararg compatibleRuntimes: String)

    public fun content(content: IResolvable)

    public fun content(content: CfnLayerVersion.ContentProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7bae529f363aeb8b4c5debaa82d1e51cef6f02933dcb12bd48296c3a9a130d9b")
    public fun content(content: CfnLayerVersion.ContentProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun layerName(layerName: String)

    public fun licenseInfo(licenseInfo: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnLayerVersionProps.Builder =
        software.amazon.awscdk.services.lambda.CfnLayerVersionProps.builder()

    override fun compatibleArchitectures(compatibleArchitectures: List<String>) {
      cdkBuilder.compatibleArchitectures(compatibleArchitectures)
    }

    override fun compatibleArchitectures(vararg compatibleArchitectures: String): Unit =
        compatibleArchitectures(compatibleArchitectures.toList())

    override fun compatibleRuntimes(compatibleRuntimes: List<String>) {
      cdkBuilder.compatibleRuntimes(compatibleRuntimes)
    }

    override fun compatibleRuntimes(vararg compatibleRuntimes: String): Unit =
        compatibleRuntimes(compatibleRuntimes.toList())

    override fun content(content: IResolvable) {
      cdkBuilder.content(content.let(IResolvable::unwrap))
    }

    override fun content(content: CfnLayerVersion.ContentProperty) {
      cdkBuilder.content(content.let(CfnLayerVersion.ContentProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7bae529f363aeb8b4c5debaa82d1e51cef6f02933dcb12bd48296c3a9a130d9b")
    override fun content(content: CfnLayerVersion.ContentProperty.Builder.() -> Unit): Unit =
        content(CfnLayerVersion.ContentProperty(content))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun layerName(layerName: String) {
      cdkBuilder.layerName(layerName)
    }

    override fun licenseInfo(licenseInfo: String) {
      cdkBuilder.licenseInfo(licenseInfo)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnLayerVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.CfnLayerVersionProps,
  ) : CdkObject(cdkObject), CfnLayerVersionProps {
    override fun compatibleArchitectures(): List<String> = unwrap(this).getCompatibleArchitectures()
        ?: emptyList()

    override fun compatibleRuntimes(): List<String> = unwrap(this).getCompatibleRuntimes() ?:
        emptyList()

    override fun content(): Any = unwrap(this).getContent()

    override fun description(): String? = unwrap(this).getDescription()

    override fun layerName(): String? = unwrap(this).getLayerName()

    override fun licenseInfo(): String? = unwrap(this).getLicenseInfo()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLayerVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnLayerVersionProps):
        CfnLayerVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLayerVersionProps):
        software.amazon.awscdk.services.lambda.CfnLayerVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CfnLayerVersionProps
  }
}
