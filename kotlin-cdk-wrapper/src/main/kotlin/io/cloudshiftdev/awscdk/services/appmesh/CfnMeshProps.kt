@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMesh`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * CfnMeshProps cfnMeshProps = CfnMeshProps.builder()
 * .meshName("meshName")
 * .spec(MeshSpecProperty.builder()
 * .egressFilter(EgressFilterProperty.builder()
 * .type("type")
 * .build())
 * .serviceDiscovery(MeshServiceDiscoveryProperty.builder()
 * .ipPreference("ipPreference")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html)
 */
public interface CfnMeshProps {
  /**
   * The name to use for the service mesh.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-meshname)
   */
  public fun meshName(): String? = unwrap(this).getMeshName()

  /**
   * The service mesh specification to apply.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-spec)
   */
  public fun spec(): Any? = unwrap(this).getSpec()

  /**
   * Optional metadata that you can apply to the service mesh to assist with categorization and
   * organization.
   *
   * Each tag consists of a key and an optional value, both of which you define. Tag keys can have a
   * maximum character length of 128 characters, and tag values can have a maximum length of 256
   * characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnMeshProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param meshName The name to use for the service mesh.
     */
    public fun meshName(meshName: String)

    /**
     * @param spec The service mesh specification to apply.
     */
    public fun spec(spec: IResolvable)

    /**
     * @param spec The service mesh specification to apply.
     */
    public fun spec(spec: CfnMesh.MeshSpecProperty)

    /**
     * @param spec The service mesh specification to apply.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("308904f39ab1f4cb6ab9a49a788ef680324e47f1b2d2d1efd3bb81673670d9ab")
    public fun spec(spec: CfnMesh.MeshSpecProperty.Builder.() -> Unit)

    /**
     * @param tags Optional metadata that you can apply to the service mesh to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Optional metadata that you can apply to the service mesh to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnMeshProps.Builder =
        software.amazon.awscdk.services.appmesh.CfnMeshProps.builder()

    /**
     * @param meshName The name to use for the service mesh.
     */
    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    /**
     * @param spec The service mesh specification to apply.
     */
    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    /**
     * @param spec The service mesh specification to apply.
     */
    override fun spec(spec: CfnMesh.MeshSpecProperty) {
      cdkBuilder.spec(spec.let(CfnMesh.MeshSpecProperty::unwrap))
    }

    /**
     * @param spec The service mesh specification to apply.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("308904f39ab1f4cb6ab9a49a788ef680324e47f1b2d2d1efd3bb81673670d9ab")
    override fun spec(spec: CfnMesh.MeshSpecProperty.Builder.() -> Unit): Unit =
        spec(CfnMesh.MeshSpecProperty(spec))

    /**
     * @param tags Optional metadata that you can apply to the service mesh to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Optional metadata that you can apply to the service mesh to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appmesh.CfnMeshProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.CfnMeshProps,
  ) : CdkObject(cdkObject), CfnMeshProps {
    /**
     * The name to use for the service mesh.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-meshname)
     */
    override fun meshName(): String? = unwrap(this).getMeshName()

    /**
     * The service mesh specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-spec)
     */
    override fun spec(): Any? = unwrap(this).getSpec()

    /**
     * Optional metadata that you can apply to the service mesh to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html#cfn-appmesh-mesh-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMeshProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnMeshProps): CfnMeshProps
        = CdkObjectWrappers.wrap(cdkObject) as? CfnMeshProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMeshProps): software.amazon.awscdk.services.appmesh.CfnMeshProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.CfnMeshProps
  }
}
