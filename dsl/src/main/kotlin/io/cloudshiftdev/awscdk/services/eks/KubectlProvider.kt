package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.NestedStack
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class KubectlProvider internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.KubectlProvider,
) : NestedStack(cdkObject), IKubectlProvider {
  /**
   * The IAM execution role of the handler.
   */
  public override fun handlerRole(): IRole = unwrap(this).getHandlerRole().let(IRole::wrap)

  /**
   * The IAM role to assume in order to perform kubectl operations against this cluster.
   */
  public override fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The custom resource provider's service token.
   */
  public override fun serviceToken(): String = unwrap(this).getServiceToken()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.KubectlProvider].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The cluster to control.
     *
     * @param cluster The cluster to control. 
     */
    public fun cluster(cluster: ICluster)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubectlProvider.Builder =
        software.amazon.awscdk.services.eks.KubectlProvider.Builder.create(scope, id)

    /**
     * The cluster to control.
     *
     * @param cluster The cluster to control. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.KubectlProvider = cdkBuilder.build()
  }

  public companion object {
    public fun fromKubectlProviderAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: KubectlProviderAttributes,
    ): IKubectlProvider =
        software.amazon.awscdk.services.eks.KubectlProvider.fromKubectlProviderAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(KubectlProviderAttributes::unwrap)).let(IKubectlProvider::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db3b6a08bf06eba23b6ec28a610bdedc6e2fd17a1c14d9dab34c23095ae0324d")
    public fun fromKubectlProviderAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: KubectlProviderAttributes.Builder.() -> Unit,
    ): IKubectlProvider = fromKubectlProviderAttributes(scope, id, KubectlProviderAttributes(attrs))

    public fun orCreate(scope: CloudshiftdevConstructsConstruct, cluster: ICluster):
        IKubectlProvider =
        software.amazon.awscdk.services.eks.KubectlProvider.getOrCreate(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        cluster.let(ICluster::unwrap)).let(IKubectlProvider::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): KubectlProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return KubectlProvider(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.KubectlProvider):
        KubectlProvider = KubectlProvider(cdkObject)

    internal fun unwrap(wrapped: KubectlProvider):
        software.amazon.awscdk.services.eks.KubectlProvider = wrapped.cdkObject
  }
}
