@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

/**
 * Kubectl Provider Attributes.
 *
 * Example:
 *
 * ```
 * IRole handlerRole = Role.fromRoleArn(this, "HandlerRole",
 * "arn:aws:iam::123456789012:role/lambda-role");
 * // get the serivceToken from the custom resource provider
 * String functionArn = Function.fromFunctionName(this, "ProviderOnEventFunc",
 * "ProviderframeworkonEvent-XXX").getFunctionArn();
 * IKubectlProvider kubectlProvider = KubectlProvider.fromKubectlProviderAttributes(this,
 * "KubectlProvider", KubectlProviderAttributes.builder()
 * .functionArn(functionArn)
 * .kubectlRoleArn("arn:aws:iam::123456789012:role/kubectl-role")
 * .handlerRole(handlerRole)
 * .build());
 * ICluster cluster = Cluster.fromClusterAttributes(this, "Cluster", ClusterAttributes.builder()
 * .clusterName("cluster")
 * .kubectlProvider(kubectlProvider)
 * .build());
 * ```
 */
public interface KubectlProviderAttributes {
  /**
   * The custom resource provider's service token.
   */
  public fun functionArn(): String

  /**
   * The IAM execution role of the handler.
   *
   * This role must be able to assume kubectlRoleArn
   */
  public fun handlerRole(): IRole

  /**
   * The IAM role to assume in order to perform kubectl operations against this cluster.
   */
  public fun kubectlRoleArn(): String

  /**
   * A builder for [KubectlProviderAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param functionArn The custom resource provider's service token. 
     */
    public fun functionArn(functionArn: String)

    /**
     * @param handlerRole The IAM execution role of the handler. 
     * This role must be able to assume kubectlRoleArn
     */
    public fun handlerRole(handlerRole: IRole)

    /**
     * @param kubectlRoleArn The IAM role to assume in order to perform kubectl operations against
     * this cluster. 
     */
    public fun kubectlRoleArn(kubectlRoleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubectlProviderAttributes.Builder =
        software.amazon.awscdk.services.eks.KubectlProviderAttributes.builder()

    /**
     * @param functionArn The custom resource provider's service token. 
     */
    override fun functionArn(functionArn: String) {
      cdkBuilder.functionArn(functionArn)
    }

    /**
     * @param handlerRole The IAM execution role of the handler. 
     * This role must be able to assume kubectlRoleArn
     */
    override fun handlerRole(handlerRole: IRole) {
      cdkBuilder.handlerRole(handlerRole.let(IRole::unwrap))
    }

    /**
     * @param kubectlRoleArn The IAM role to assume in order to perform kubectl operations against
     * this cluster. 
     */
    override fun kubectlRoleArn(kubectlRoleArn: String) {
      cdkBuilder.kubectlRoleArn(kubectlRoleArn)
    }

    public fun build(): software.amazon.awscdk.services.eks.KubectlProviderAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.KubectlProviderAttributes,
  ) : CdkObject(cdkObject), KubectlProviderAttributes {
    /**
     * The custom resource provider's service token.
     */
    override fun functionArn(): String = unwrap(this).getFunctionArn()

    /**
     * The IAM execution role of the handler.
     *
     * This role must be able to assume kubectlRoleArn
     */
    override fun handlerRole(): IRole = unwrap(this).getHandlerRole().let(IRole::wrap)

    /**
     * The IAM role to assume in order to perform kubectl operations against this cluster.
     */
    override fun kubectlRoleArn(): String = unwrap(this).getKubectlRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KubectlProviderAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.KubectlProviderAttributes):
        KubectlProviderAttributes = CdkObjectWrappers.wrap(cdkObject) as? KubectlProviderAttributes
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: KubectlProviderAttributes):
        software.amazon.awscdk.services.eks.KubectlProviderAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.KubectlProviderAttributes
  }
}
