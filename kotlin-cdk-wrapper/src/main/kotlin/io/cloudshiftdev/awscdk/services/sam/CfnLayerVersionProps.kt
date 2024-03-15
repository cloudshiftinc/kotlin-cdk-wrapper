@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnLayerVersionProps {
  public fun compatibleRuntimes(): List<String> = unwrap(this).getCompatibleRuntimes() ?:
      emptyList()

  public fun contentUri(): Any? = unwrap(this).getContentUri()

  public fun description(): String? = unwrap(this).getDescription()

  public fun layerName(): String? = unwrap(this).getLayerName()

  public fun licenseInfo(): String? = unwrap(this).getLicenseInfo()

  public fun retentionPolicy(): String? = unwrap(this).getRetentionPolicy()

  @CdkDslMarker
  public interface Builder {
    public fun compatibleRuntimes(compatibleRuntimes: List<String>)

    public fun compatibleRuntimes(vararg compatibleRuntimes: String)

    public fun contentUri(contentUri: String)

    public fun contentUri(contentUri: IResolvable)

    public fun contentUri(contentUri: CfnLayerVersion.S3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f3ccc33822506a6451eb647d9e3f1ac27af90dbbb761f4a6e60b7827f3bb806")
    public fun contentUri(contentUri: CfnLayerVersion.S3LocationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun layerName(layerName: String)

    public fun licenseInfo(licenseInfo: String)

    public fun retentionPolicy(retentionPolicy: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnLayerVersionProps.Builder =
        software.amazon.awscdk.services.sam.CfnLayerVersionProps.builder()

    override fun compatibleRuntimes(compatibleRuntimes: List<String>) {
      cdkBuilder.compatibleRuntimes(compatibleRuntimes)
    }

    override fun compatibleRuntimes(vararg compatibleRuntimes: String): Unit =
        compatibleRuntimes(compatibleRuntimes.toList())

    override fun contentUri(contentUri: String) {
      cdkBuilder.contentUri(contentUri)
    }

    override fun contentUri(contentUri: IResolvable) {
      cdkBuilder.contentUri(contentUri.let(IResolvable::unwrap))
    }

    override fun contentUri(contentUri: CfnLayerVersion.S3LocationProperty) {
      cdkBuilder.contentUri(contentUri.let(CfnLayerVersion.S3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f3ccc33822506a6451eb647d9e3f1ac27af90dbbb761f4a6e60b7827f3bb806")
    override fun contentUri(contentUri: CfnLayerVersion.S3LocationProperty.Builder.() -> Unit): Unit
        = contentUri(CfnLayerVersion.S3LocationProperty(contentUri))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun layerName(layerName: String) {
      cdkBuilder.layerName(layerName)
    }

    override fun licenseInfo(licenseInfo: String) {
      cdkBuilder.licenseInfo(licenseInfo)
    }

    override fun retentionPolicy(retentionPolicy: String) {
      cdkBuilder.retentionPolicy(retentionPolicy)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnLayerVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sam.CfnLayerVersionProps,
  ) : CdkObject(cdkObject), CfnLayerVersionProps {
    override fun compatibleRuntimes(): List<String> = unwrap(this).getCompatibleRuntimes() ?:
        emptyList()

    override fun contentUri(): Any? = unwrap(this).getContentUri()

    override fun description(): String? = unwrap(this).getDescription()

    override fun layerName(): String? = unwrap(this).getLayerName()

    override fun licenseInfo(): String? = unwrap(this).getLicenseInfo()

    override fun retentionPolicy(): String? = unwrap(this).getRetentionPolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLayerVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnLayerVersionProps):
        CfnLayerVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLayerVersionProps):
        software.amazon.awscdk.services.sam.CfnLayerVersionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sam.CfnLayerVersionProps
  }
}
