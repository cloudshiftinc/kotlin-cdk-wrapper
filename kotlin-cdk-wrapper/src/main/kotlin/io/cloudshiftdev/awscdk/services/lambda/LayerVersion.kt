@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Defines a new Lambda Layer version.
 *
 * Example:
 *
 * ```
 * LayerVersion.Builder.create(this, "MyLayer")
 * .removalPolicy(RemovalPolicy.RETAIN)
 * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
 * .compatibleArchitectures(List.of(Architecture.X86_64, Architecture.ARM_64))
 * .build();
 * ```
 */
public open class LayerVersion(
  cdkObject: software.amazon.awscdk.services.lambda.LayerVersion,
) : Resource(cdkObject),
    ILayerVersion {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LayerVersionProps,
  ) :
      this(software.amazon.awscdk.services.lambda.LayerVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(LayerVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LayerVersionProps.Builder.() -> Unit,
  ) : this(scope, id, LayerVersionProps(props)
  )

  /**
   * Add permission for this layer version to specific entities.
   *
   * Usage within
   * the same account where the layer is defined is always allowed and does not
   * require calling this method. Note that the principal that creates the
   * Lambda function using the layer (for example, a CloudFormation changeset
   * execution role) also needs to have the `lambda:GetLayerVersion`
   * permission on the layer version.
   *
   * @param id 
   * @param permission 
   */
  public override fun addPermission(id: String, permission: LayerVersionPermission) {
    unwrap(this).addPermission(id, permission.let(LayerVersionPermission.Companion::unwrap))
  }

  /**
   * Add permission for this layer version to specific entities.
   *
   * Usage within
   * the same account where the layer is defined is always allowed and does not
   * require calling this method. Note that the principal that creates the
   * Lambda function using the layer (for example, a CloudFormation changeset
   * execution role) also needs to have the `lambda:GetLayerVersion`
   * permission on the layer version.
   *
   * @param id 
   * @param permission 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eec498e4e61d6da6cbaf711269e77f3d0940f81924a2490180fb8f64482ccdbd")
  public override fun addPermission(id: String,
      permission: LayerVersionPermission.Builder.() -> Unit): Unit = addPermission(id,
      LayerVersionPermission(permission))

  /**
   * The runtimes compatible with this Layer.
   */
  public override fun compatibleRuntimes(): List<Runtime> =
      unwrap(this).getCompatibleRuntimes()?.map(Runtime::wrap) ?: emptyList()

  /**
   * The ARN of the Lambda Layer version that this Layer defines.
   */
  public override fun layerVersionArn(): String = unwrap(this).getLayerVersionArn()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.LayerVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The content of this Layer.
     *
     * Using `Code.fromInline` is not supported.
     *
     * @param code The content of this Layer. 
     */
    public fun code(code: Code)

    /**
     * The system architectures compatible with this layer.
     *
     * Default: [Architecture.X86_64]
     *
     * @param compatibleArchitectures The system architectures compatible with this layer. 
     */
    public fun compatibleArchitectures(compatibleArchitectures: List<Architecture>)

    /**
     * The system architectures compatible with this layer.
     *
     * Default: [Architecture.X86_64]
     *
     * @param compatibleArchitectures The system architectures compatible with this layer. 
     */
    public fun compatibleArchitectures(vararg compatibleArchitectures: Architecture)

    /**
     * The runtimes compatible with this Layer.
     *
     * Default: - All runtimes are supported.
     *
     * @param compatibleRuntimes The runtimes compatible with this Layer. 
     */
    public fun compatibleRuntimes(compatibleRuntimes: List<Runtime>)

    /**
     * The runtimes compatible with this Layer.
     *
     * Default: - All runtimes are supported.
     *
     * @param compatibleRuntimes The runtimes compatible with this Layer. 
     */
    public fun compatibleRuntimes(vararg compatibleRuntimes: Runtime)

    /**
     * The description the this Lambda Layer.
     *
     * Default: - No description.
     *
     * @param description The description the this Lambda Layer. 
     */
    public fun description(description: String)

    /**
     * The name of the layer.
     *
     * Default: - A name will be generated.
     *
     * @param layerVersionName The name of the layer. 
     */
    public fun layerVersionName(layerVersionName: String)

    /**
     * The SPDX licence identifier or URL to the license file for this layer.
     *
     * Default: - No license information will be recorded.
     *
     * @param license The SPDX licence identifier or URL to the license file for this layer. 
     */
    public fun license(license: String)

    /**
     * Whether to retain this version of the layer when a new version is added or when the stack is
     * deleted.
     *
     * Default: RemovalPolicy.DESTROY
     *
     * @param removalPolicy Whether to retain this version of the layer when a new version is added
     * or when the stack is deleted. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.LayerVersion.Builder =
        software.amazon.awscdk.services.lambda.LayerVersion.Builder.create(scope, id)

    /**
     * The content of this Layer.
     *
     * Using `Code.fromInline` is not supported.
     *
     * @param code The content of this Layer. 
     */
    override fun code(code: Code) {
      cdkBuilder.code(code.let(Code.Companion::unwrap))
    }

    /**
     * The system architectures compatible with this layer.
     *
     * Default: [Architecture.X86_64]
     *
     * @param compatibleArchitectures The system architectures compatible with this layer. 
     */
    override fun compatibleArchitectures(compatibleArchitectures: List<Architecture>) {
      cdkBuilder.compatibleArchitectures(compatibleArchitectures.map(Architecture.Companion::unwrap))
    }

    /**
     * The system architectures compatible with this layer.
     *
     * Default: [Architecture.X86_64]
     *
     * @param compatibleArchitectures The system architectures compatible with this layer. 
     */
    override fun compatibleArchitectures(vararg compatibleArchitectures: Architecture): Unit =
        compatibleArchitectures(compatibleArchitectures.toList())

    /**
     * The runtimes compatible with this Layer.
     *
     * Default: - All runtimes are supported.
     *
     * @param compatibleRuntimes The runtimes compatible with this Layer. 
     */
    override fun compatibleRuntimes(compatibleRuntimes: List<Runtime>) {
      cdkBuilder.compatibleRuntimes(compatibleRuntimes.map(Runtime.Companion::unwrap))
    }

    /**
     * The runtimes compatible with this Layer.
     *
     * Default: - All runtimes are supported.
     *
     * @param compatibleRuntimes The runtimes compatible with this Layer. 
     */
    override fun compatibleRuntimes(vararg compatibleRuntimes: Runtime): Unit =
        compatibleRuntimes(compatibleRuntimes.toList())

    /**
     * The description the this Lambda Layer.
     *
     * Default: - No description.
     *
     * @param description The description the this Lambda Layer. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the layer.
     *
     * Default: - A name will be generated.
     *
     * @param layerVersionName The name of the layer. 
     */
    override fun layerVersionName(layerVersionName: String) {
      cdkBuilder.layerVersionName(layerVersionName)
    }

    /**
     * The SPDX licence identifier or URL to the license file for this layer.
     *
     * Default: - No license information will be recorded.
     *
     * @param license The SPDX licence identifier or URL to the license file for this layer. 
     */
    override fun license(license: String) {
      cdkBuilder.license(license)
    }

    /**
     * Whether to retain this version of the layer when a new version is added or when the stack is
     * deleted.
     *
     * Default: RemovalPolicy.DESTROY
     *
     * @param removalPolicy Whether to retain this version of the layer when a new version is added
     * or when the stack is deleted. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.LayerVersion = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.lambda.LayerVersion.PROPERTY_INJECTION_ID

    public fun fromLayerVersionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      layerVersionArn: String,
    ): ILayerVersion =
        software.amazon.awscdk.services.lambda.LayerVersion.fromLayerVersionArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, layerVersionArn).let(ILayerVersion::wrap)

    public fun fromLayerVersionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: LayerVersionAttributes,
    ): ILayerVersion =
        software.amazon.awscdk.services.lambda.LayerVersion.fromLayerVersionAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(LayerVersionAttributes.Companion::unwrap)).let(ILayerVersion::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c33b763f8a234acfda5b5e97176cbc77edba51fa8a321893bd878800bc16f274")
    public fun fromLayerVersionAttributes(
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
        = wrapped.cdkObject as software.amazon.awscdk.services.lambda.LayerVersion
  }
}
