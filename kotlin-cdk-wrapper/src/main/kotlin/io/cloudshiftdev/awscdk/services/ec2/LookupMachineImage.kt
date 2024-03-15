@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public open class LookupMachineImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.LookupMachineImage,
) : CdkObject(cdkObject), IMachineImage {
  public override fun image(scope: Construct): MachineImageConfig =
      unwrap(this).getImage(scope.let(Construct::unwrap)).let(MachineImageConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun filters(filters: Map<String, List<String>>)

    public fun name(name: String)

    public fun owners(owners: List<String>)

    public fun owners(vararg owners: String)

    public fun userData(userData: UserData)

    public fun windows(windows: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LookupMachineImage.Builder =
        software.amazon.awscdk.services.ec2.LookupMachineImage.Builder.create()

    override fun filters(filters: Map<String, List<String>>) {
      cdkBuilder.filters(filters)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun owners(owners: List<String>) {
      cdkBuilder.owners(owners)
    }

    override fun owners(vararg owners: String): Unit = owners(owners.toList())

    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    override fun windows(windows: Boolean) {
      cdkBuilder.windows(windows)
    }

    public fun build(): software.amazon.awscdk.services.ec2.LookupMachineImage = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LookupMachineImage {
      val builderImpl = BuilderImpl()
      return LookupMachineImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LookupMachineImage):
        LookupMachineImage = LookupMachineImage(cdkObject)

    internal fun unwrap(wrapped: LookupMachineImage):
        software.amazon.awscdk.services.ec2.LookupMachineImage = wrapped.cdkObject
  }
}
