@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Construct for installing the AWS ALB Contoller on EKS clusters.
 *
 * Use the factory functions `get` and `getOrCreate` to obtain/create instances of this controller.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * AlbControllerVersion albControllerVersion;
 * Cluster cluster;
 * Object policy;
 * AlbController albController = AlbController.Builder.create(this, "MyAlbController")
 * .cluster(cluster)
 * .version(albControllerVersion)
 * // the properties below are optional
 * .policy(policy)
 * .repository("repository")
 * .build();
 * ```
 *
 * [Documentation](https://kubernetes-sigs.github.io/aws-load-balancer-controller)
 */
public open class AlbController(
  cdkObject: software.amazon.awscdk.services.eks.AlbController,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AlbControllerProps,
  ) :
      this(software.amazon.awscdk.services.eks.AlbController(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AlbControllerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AlbControllerProps.Builder.() -> Unit,
  ) : this(scope, id, AlbControllerProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.AlbController].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [disable-awslint:ref-via-interface] Cluster to install the controller onto.
     *
     * @param cluster [disable-awslint:ref-via-interface] Cluster to install the controller onto. 
     */
    public fun cluster(cluster: Cluster)

    /**
     * The IAM policy to apply to the service account.
     *
     * If you're using one of the built-in versions, this is not required since
     * CDK ships with the appropriate policies for those versions.
     *
     * However, if you are using a custom version, this is required (and validated).
     *
     * Default: - Corresponds to the predefined version.
     *
     * @param policy The IAM policy to apply to the service account. 
     */
    public fun policy(policy: Any)

    /**
     * The repository to pull the controller image from.
     *
     * Note that the default repository works for most regions, but not all.
     * If the repository is not applicable to your region, use a custom repository
     * according to the information here:
     * https://github.com/kubernetes-sigs/aws-load-balancer-controller/releases.
     *
     * Default: '602401143452.dkr.ecr.us-west-2.amazonaws.com/amazon/aws-load-balancer-controller'
     *
     * @param repository The repository to pull the controller image from. 
     */
    public fun repository(repository: String)

    /**
     * Version of the controller.
     *
     * @param version Version of the controller. 
     */
    public fun version(version: AlbControllerVersion)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AlbController.Builder =
        software.amazon.awscdk.services.eks.AlbController.Builder.create(scope, id)

    /**
     * [disable-awslint:ref-via-interface] Cluster to install the controller onto.
     *
     * @param cluster [disable-awslint:ref-via-interface] Cluster to install the controller onto. 
     */
    override fun cluster(cluster: Cluster) {
      cdkBuilder.cluster(cluster.let(Cluster.Companion::unwrap))
    }

    /**
     * The IAM policy to apply to the service account.
     *
     * If you're using one of the built-in versions, this is not required since
     * CDK ships with the appropriate policies for those versions.
     *
     * However, if you are using a custom version, this is required (and validated).
     *
     * Default: - Corresponds to the predefined version.
     *
     * @param policy The IAM policy to apply to the service account. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * The repository to pull the controller image from.
     *
     * Note that the default repository works for most regions, but not all.
     * If the repository is not applicable to your region, use a custom repository
     * according to the information here:
     * https://github.com/kubernetes-sigs/aws-load-balancer-controller/releases.
     *
     * Default: '602401143452.dkr.ecr.us-west-2.amazonaws.com/amazon/aws-load-balancer-controller'
     *
     * @param repository The repository to pull the controller image from. 
     */
    override fun repository(repository: String) {
      cdkBuilder.repository(repository)
    }

    /**
     * Version of the controller.
     *
     * @param version Version of the controller. 
     */
    override fun version(version: AlbControllerVersion) {
      cdkBuilder.version(version.let(AlbControllerVersion.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.AlbController = cdkBuilder.build()
  }

  public companion object {
    public fun create(scope: CloudshiftdevConstructsConstruct, props: AlbControllerProps):
        AlbController =
        software.amazon.awscdk.services.eks.AlbController.create(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        props.let(AlbControllerProps.Companion::unwrap)).let(AlbController::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3abec2df923af4b086c4ed5b4438c030eef16ecfd9e5fa74e3b42aaa7207f58f")
    public fun create(scope: CloudshiftdevConstructsConstruct,
        props: AlbControllerProps.Builder.() -> Unit): AlbController = create(scope,
        AlbControllerProps(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AlbController {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AlbController(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AlbController): AlbController =
        AlbController(cdkObject)

    internal fun unwrap(wrapped: AlbController): software.amazon.awscdk.services.eks.AlbController =
        wrapped.cdkObject as software.amazon.awscdk.services.eks.AlbController
  }
}
