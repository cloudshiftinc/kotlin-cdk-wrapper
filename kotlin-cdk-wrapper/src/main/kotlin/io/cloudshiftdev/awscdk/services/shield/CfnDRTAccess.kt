@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.shield

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDRTAccess internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.shield.CfnDRTAccess,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logBucketList(): List<String> = unwrap(this).getLogBucketList() ?: emptyList()

  public open fun logBucketList(`value`: List<String>) {
    unwrap(this).setLogBucketList(`value`)
  }

  public open fun logBucketList(vararg `value`: String): Unit = logBucketList(`value`.toList())

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun logBucketList(logBucketList: List<String>)

    public fun logBucketList(vararg logBucketList: String)

    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.shield.CfnDRTAccess.Builder =
        software.amazon.awscdk.services.shield.CfnDRTAccess.Builder.create(scope, id)

    override fun logBucketList(logBucketList: List<String>) {
      cdkBuilder.logBucketList(logBucketList)
    }

    override fun logBucketList(vararg logBucketList: String): Unit =
        logBucketList(logBucketList.toList())

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.shield.CfnDRTAccess = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.shield.CfnDRTAccess.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDRTAccess {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDRTAccess(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnDRTAccess): CfnDRTAccess
        = CfnDRTAccess(cdkObject)

    internal fun unwrap(wrapped: CfnDRTAccess): software.amazon.awscdk.services.shield.CfnDRTAccess
        = wrapped.cdkObject
  }
}
