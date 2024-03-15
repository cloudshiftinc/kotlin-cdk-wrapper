@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnBatchScramSecretProps {
  public fun clusterArn(): String

  public fun secretArnList(): List<String> = unwrap(this).getSecretArnList() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun clusterArn(clusterArn: String)

    public fun secretArnList(secretArnList: List<String>)

    public fun secretArnList(vararg secretArnList: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnBatchScramSecretProps.Builder =
        software.amazon.awscdk.services.msk.CfnBatchScramSecretProps.builder()

    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    override fun secretArnList(secretArnList: List<String>) {
      cdkBuilder.secretArnList(secretArnList)
    }

    override fun secretArnList(vararg secretArnList: String): Unit =
        secretArnList(secretArnList.toList())

    public fun build(): software.amazon.awscdk.services.msk.CfnBatchScramSecretProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.msk.CfnBatchScramSecretProps,
  ) : CdkObject(cdkObject), CfnBatchScramSecretProps {
    override fun clusterArn(): String = unwrap(this).getClusterArn()

    override fun secretArnList(): List<String> = unwrap(this).getSecretArnList() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBatchScramSecretProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnBatchScramSecretProps):
        CfnBatchScramSecretProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBatchScramSecretProps):
        software.amazon.awscdk.services.msk.CfnBatchScramSecretProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.msk.CfnBatchScramSecretProps
  }
}
