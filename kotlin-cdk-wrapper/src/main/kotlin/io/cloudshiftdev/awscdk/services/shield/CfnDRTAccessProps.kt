@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.shield

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDRTAccessProps {
  public fun logBucketList(): List<String> = unwrap(this).getLogBucketList() ?: emptyList()

  public fun roleArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun logBucketList(logBucketList: List<String>)

    public fun logBucketList(vararg logBucketList: String)

    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.shield.CfnDRTAccessProps.Builder =
        software.amazon.awscdk.services.shield.CfnDRTAccessProps.builder()

    override fun logBucketList(logBucketList: List<String>) {
      cdkBuilder.logBucketList(logBucketList)
    }

    override fun logBucketList(vararg logBucketList: String): Unit =
        logBucketList(logBucketList.toList())

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.shield.CfnDRTAccessProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.shield.CfnDRTAccessProps,
  ) : CdkObject(cdkObject), CfnDRTAccessProps {
    override fun logBucketList(): List<String> = unwrap(this).getLogBucketList() ?: emptyList()

    override fun roleArn(): String = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDRTAccessProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnDRTAccessProps):
        CfnDRTAccessProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDRTAccessProps):
        software.amazon.awscdk.services.shield.CfnDRTAccessProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.shield.CfnDRTAccessProps
  }
}
