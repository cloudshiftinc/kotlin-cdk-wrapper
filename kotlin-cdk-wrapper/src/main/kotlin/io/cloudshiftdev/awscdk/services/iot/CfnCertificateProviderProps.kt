@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnCertificateProviderProps {
  public fun accountDefaultForOperations(): List<String>

  public fun certificateProviderName(): String? = unwrap(this).getCertificateProviderName()

  public fun lambdaFunctionArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accountDefaultForOperations(accountDefaultForOperations: List<String>)

    public fun accountDefaultForOperations(vararg accountDefaultForOperations: String)

    public fun certificateProviderName(certificateProviderName: String)

    public fun lambdaFunctionArn(lambdaFunctionArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCertificateProviderProps.Builder
        = software.amazon.awscdk.services.iot.CfnCertificateProviderProps.builder()

    override fun accountDefaultForOperations(accountDefaultForOperations: List<String>) {
      cdkBuilder.accountDefaultForOperations(accountDefaultForOperations)
    }

    override fun accountDefaultForOperations(vararg accountDefaultForOperations: String): Unit =
        accountDefaultForOperations(accountDefaultForOperations.toList())

    override fun certificateProviderName(certificateProviderName: String) {
      cdkBuilder.certificateProviderName(certificateProviderName)
    }

    override fun lambdaFunctionArn(lambdaFunctionArn: String) {
      cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnCertificateProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnCertificateProviderProps,
  ) : CdkObject(cdkObject), CfnCertificateProviderProps {
    override fun accountDefaultForOperations(): List<String> =
        unwrap(this).getAccountDefaultForOperations()

    override fun certificateProviderName(): String? = unwrap(this).getCertificateProviderName()

    override fun lambdaFunctionArn(): String = unwrap(this).getLambdaFunctionArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCertificateProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCertificateProviderProps):
        CfnCertificateProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateProviderProps):
        software.amazon.awscdk.services.iot.CfnCertificateProviderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnCertificateProviderProps
  }
}
