@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.systemsmanagersap

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnApplicationProps {
  public fun applicationId(): String

  public fun applicationType(): String

  public fun credentials(): Any? = unwrap(this).getCredentials()

  public fun instances(): List<String> = unwrap(this).getInstances() ?: emptyList()

  public fun sapInstanceNumber(): String? = unwrap(this).getSapInstanceNumber()

  public fun sid(): String? = unwrap(this).getSid()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun applicationId(applicationId: String)

    public fun applicationType(applicationType: String)

    public fun credentials(credentials: IResolvable)

    public fun credentials(credentials: List<Any>)

    public fun credentials(vararg credentials: Any)

    public fun instances(instances: List<String>)

    public fun instances(vararg instances: String)

    public fun sapInstanceNumber(sapInstanceNumber: String)

    public fun sid(sid: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps.builder()

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun applicationType(applicationType: String) {
      cdkBuilder.applicationType(applicationType)
    }

    override fun credentials(credentials: IResolvable) {
      cdkBuilder.credentials(credentials.let(IResolvable::unwrap))
    }

    override fun credentials(credentials: List<Any>) {
      cdkBuilder.credentials(credentials)
    }

    override fun credentials(vararg credentials: Any): Unit = credentials(credentials.toList())

    override fun instances(instances: List<String>) {
      cdkBuilder.instances(instances)
    }

    override fun instances(vararg instances: String): Unit = instances(instances.toList())

    override fun sapInstanceNumber(sapInstanceNumber: String) {
      cdkBuilder.sapInstanceNumber(sapInstanceNumber)
    }

    override fun sid(sid: String) {
      cdkBuilder.sid(sid)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    override fun applicationId(): String = unwrap(this).getApplicationId()

    override fun applicationType(): String = unwrap(this).getApplicationType()

    override fun credentials(): Any? = unwrap(this).getCredentials()

    override fun instances(): List<String> = unwrap(this).getInstances() ?: emptyList()

    override fun sapInstanceNumber(): String? = unwrap(this).getSapInstanceNumber()

    override fun sid(): String? = unwrap(this).getSid()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps):
        CfnApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps
  }
}
