@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents an Amazon EKS Add-On.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * Addon.Builder.create(this, "Addon")
 * .cluster(cluster)
 * .addonName("aws-guardduty-agent")
 * .addonVersion("v1.6.1")
 * // whether to preserve the add-on software on your cluster but Amazon EKS stops managing any
 * settings for the add-on.
 * .preserveOnDelete(false)
 * .build();
 * ```
 */
public open class Addon(
  cdkObject: software.amazon.awscdk.services.eks.Addon,
) : Resource(cdkObject),
    IAddon {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AddonProps,
  ) :
      this(software.amazon.awscdk.services.eks.Addon(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AddonProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AddonProps.Builder.() -> Unit,
  ) : this(scope, id, AddonProps(props)
  )

  /**
   * Arn of the addon.
   */
  public override fun addonArn(): String = unwrap(this).getAddonArn()

  /**
   * Name of the addon.
   */
  public override fun addonName(): String = unwrap(this).getAddonName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.Addon].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Name of the Add-On.
     *
     * @param addonName Name of the Add-On. 
     */
    public fun addonName(addonName: String)

    /**
     * Version of the Add-On.
     *
     * You can check all available versions with describe-addon-versons.
     * For example, this lists all available versions for the `eks-pod-identity-agent` addon:
     * $ aws eks describe-addon-versions --addon-name eks-pod-identity-agent \
     * --query 'addons[*].addonVersions[*].addonVersion'
     *
     * Default: the latest version.
     *
     * @param addonVersion Version of the Add-On. 
     */
    public fun addonVersion(addonVersion: String)

    /**
     * The EKS cluster the Add-On is associated with.
     *
     * @param cluster The EKS cluster the Add-On is associated with. 
     */
    public fun cluster(cluster: ICluster)

    /**
     * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops
     * managing any settings for the add-on.
     *
     * If an IAM account is associated with the add-on, it isn't removed.
     *
     * Default: true
     *
     * @param preserveOnDelete Specifying this option preserves the add-on software on your cluster
     * but Amazon EKS stops managing any settings for the add-on. 
     */
    public fun preserveOnDelete(preserveOnDelete: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.Addon.Builder =
        software.amazon.awscdk.services.eks.Addon.Builder.create(scope, id)

    /**
     * Name of the Add-On.
     *
     * @param addonName Name of the Add-On. 
     */
    override fun addonName(addonName: String) {
      cdkBuilder.addonName(addonName)
    }

    /**
     * Version of the Add-On.
     *
     * You can check all available versions with describe-addon-versons.
     * For example, this lists all available versions for the `eks-pod-identity-agent` addon:
     * $ aws eks describe-addon-versions --addon-name eks-pod-identity-agent \
     * --query 'addons[*].addonVersions[*].addonVersion'
     *
     * Default: the latest version.
     *
     * @param addonVersion Version of the Add-On. 
     */
    override fun addonVersion(addonVersion: String) {
      cdkBuilder.addonVersion(addonVersion)
    }

    /**
     * The EKS cluster the Add-On is associated with.
     *
     * @param cluster The EKS cluster the Add-On is associated with. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster.Companion::unwrap))
    }

    /**
     * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops
     * managing any settings for the add-on.
     *
     * If an IAM account is associated with the add-on, it isn't removed.
     *
     * Default: true
     *
     * @param preserveOnDelete Specifying this option preserves the add-on software on your cluster
     * but Amazon EKS stops managing any settings for the add-on. 
     */
    override fun preserveOnDelete(preserveOnDelete: Boolean) {
      cdkBuilder.preserveOnDelete(preserveOnDelete)
    }

    public fun build(): software.amazon.awscdk.services.eks.Addon = cdkBuilder.build()
  }

  public companion object {
    public fun fromAddonArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      addonArn: String,
    ): IAddon =
        software.amazon.awscdk.services.eks.Addon.fromAddonArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, addonArn).let(IAddon::wrap)

    public fun fromAddonAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AddonAttributes,
    ): IAddon =
        software.amazon.awscdk.services.eks.Addon.fromAddonAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(AddonAttributes.Companion::unwrap)).let(IAddon::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ff0b044df6eb43afba012c6e237e93207080143d79437502f8ec440b680d213")
    public fun fromAddonAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AddonAttributes.Builder.() -> Unit,
    ): IAddon = fromAddonAttributes(scope, id, AddonAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Addon {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Addon(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.Addon): Addon =
        Addon(cdkObject)

    internal fun unwrap(wrapped: Addon): software.amazon.awscdk.services.eks.Addon =
        wrapped.cdkObject as software.amazon.awscdk.services.eks.Addon
  }
}
