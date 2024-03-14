package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class LayerVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.LayerVersion,
) : Resource(cdkObject), ILayerVersion {
  public override fun addPermission(id: String, permission: LayerVersionPermission) {
    unwrap(this).addPermission(id, permission.let(LayerVersionPermission::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eec498e4e61d6da6cbaf711269e77f3d0940f81924a2490180fb8f64482ccdbd")
  public override fun addPermission(id: String,
      permission: LayerVersionPermission.Builder.() -> Unit): Unit = addPermission(id,
      LayerVersionPermission(permission))

  public override fun compatibleRuntimes(): List<Runtime> =
      unwrap(this).getCompatibleRuntimes()?.map(Runtime::wrap) ?: emptyList()

  public override fun layerVersionArn(): String = unwrap(this).getLayerVersionArn()

  public interface Builder {
    public fun code(code: Code) {
    }

    public fun compatibleArchitectures(compatibleArchitectures: List<Architecture>) {
    }

    public fun compatibleRuntimes(compatibleRuntimes: List<Runtime>) {
    }

    public fun description(description: String) {
    }

    public fun layerVersionName(layerVersionName: String) {
    }

    public fun license(license: String) {
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.LayerVersion.Builder =
        software.amazon.awscdk.services.lambda.LayerVersion.Builder.create(scope, id)

    public override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    public override fun compatibleArchitectures(compatibleArchitectures: List<Architecture>) {
      cdkBuilder.compatibleArchitectures(compatibleArchitectures.map(Architecture::unwrap))
    }

    public override fun compatibleRuntimes(compatibleRuntimes: List<Runtime>) {
      cdkBuilder.compatibleRuntimes(compatibleRuntimes.map(Runtime::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun layerVersionName(layerVersionName: String) {
      cdkBuilder.layerVersionName(layerVersionName)
    }

    public override fun license(license: String) {
      cdkBuilder.license(license)
    }

    public override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.LayerVersion = cdkBuilder.build()
  }

  public companion object {
    public open fun fromLayerVersionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      layerVersionArn: String,
    ): ILayerVersion =
        software.amazon.awscdk.services.lambda.LayerVersion.fromLayerVersionArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, layerVersionArn).let(ILayerVersion::wrap)

    public open fun fromLayerVersionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: LayerVersionAttributes,
    ): ILayerVersion =
        software.amazon.awscdk.services.lambda.LayerVersion.fromLayerVersionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(LayerVersionAttributes::unwrap)).let(ILayerVersion::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c33b763f8a234acfda5b5e97176cbc77edba51fa8a321893bd878800bc16f274")
    public open fun fromLayerVersionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: LayerVersionAttributes.Builder.() -> Unit,
    ): ILayerVersion = fromLayerVersionAttributes(scope, id, LayerVersionAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LayerVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LayerVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LayerVersion): LayerVersion
        = LayerVersion(cdkObject)

    internal fun unwrap(wrapped: LayerVersion): software.amazon.awscdk.services.lambda.LayerVersion
        = wrapped.cdkObject
  }
}
