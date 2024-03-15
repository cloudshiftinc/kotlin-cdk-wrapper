@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

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

public open class CfnLayerVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.CfnLayerVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrLayerVersionArn(): String = unwrap(this).getAttrLayerVersionArn()

  public open fun compatibleArchitectures(): List<String> =
      unwrap(this).getCompatibleArchitectures() ?: emptyList()

  public open fun compatibleArchitectures(`value`: List<String>) {
    unwrap(this).setCompatibleArchitectures(`value`)
  }

  public open fun compatibleArchitectures(vararg `value`: String): Unit =
      compatibleArchitectures(`value`.toList())

  public open fun compatibleRuntimes(): List<String> = unwrap(this).getCompatibleRuntimes() ?:
      emptyList()

  public open fun compatibleRuntimes(`value`: List<String>) {
    unwrap(this).setCompatibleRuntimes(`value`)
  }

  public open fun compatibleRuntimes(vararg `value`: String): Unit =
      compatibleRuntimes(`value`.toList())

  public open fun content(): Any = unwrap(this).getContent()

  public open fun content(`value`: IResolvable) {
    unwrap(this).setContent(`value`.let(IResolvable::unwrap))
  }

  public open fun content(`value`: ContentProperty) {
    unwrap(this).setContent(`value`.let(ContentProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4b2315742ae79120c21d4ff1bfb720e675a7715687d2aa87a17c238fccf1c351")
  public open fun content(`value`: ContentProperty.Builder.() -> Unit): Unit =
      content(ContentProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun layerName(): String? = unwrap(this).getLayerName()

  public open fun layerName(`value`: String) {
    unwrap(this).setLayerName(`value`)
  }

  public open fun licenseInfo(): String? = unwrap(this).getLicenseInfo()

  public open fun licenseInfo(`value`: String) {
    unwrap(this).setLicenseInfo(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun compatibleArchitectures(compatibleArchitectures: List<String>)

    public fun compatibleArchitectures(vararg compatibleArchitectures: String)

    public fun compatibleRuntimes(compatibleRuntimes: List<String>)

    public fun compatibleRuntimes(vararg compatibleRuntimes: String)

    public fun content(content: IResolvable)

    public fun content(content: ContentProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d9f4b6b8e6a4340d0fd83dea8fc7f5f98bb8cc60c16fc293abaa52663a51e15")
    public fun content(content: ContentProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun layerName(layerName: String)

    public fun licenseInfo(licenseInfo: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnLayerVersion.Builder =
        software.amazon.awscdk.services.lambda.CfnLayerVersion.Builder.create(scope, id)

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

    override fun content(content: ContentProperty) {
      cdkBuilder.content(content.let(ContentProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d9f4b6b8e6a4340d0fd83dea8fc7f5f98bb8cc60c16fc293abaa52663a51e15")
    override fun content(content: ContentProperty.Builder.() -> Unit): Unit =
        content(ContentProperty(content))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun layerName(layerName: String) {
      cdkBuilder.layerName(layerName)
    }

    override fun licenseInfo(licenseInfo: String) {
      cdkBuilder.licenseInfo(licenseInfo)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnLayerVersion = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lambda.CfnLayerVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLayerVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLayerVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnLayerVersion):
        CfnLayerVersion = CfnLayerVersion(cdkObject)

    internal fun unwrap(wrapped: CfnLayerVersion):
        software.amazon.awscdk.services.lambda.CfnLayerVersion = wrapped.cdkObject
  }

  public interface ContentProperty {
    public fun s3Bucket(): String

    public fun s3Key(): String

    public fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()

    @CdkDslMarker
    public interface Builder {
      public fun s3Bucket(s3Bucket: String)

      public fun s3Key(s3Key: String)

      public fun s3ObjectVersion(s3ObjectVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty.builder()

      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      override fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty,
    ) : CdkObject(cdkObject), ContentProperty {
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      override fun s3Key(): String = unwrap(this).getS3Key()

      override fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty):
          ContentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContentProperty):
          software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnLayerVersion.ContentProperty
    }
  }
}
