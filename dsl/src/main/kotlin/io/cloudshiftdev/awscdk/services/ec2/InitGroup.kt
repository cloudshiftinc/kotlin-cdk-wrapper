package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Number
import kotlin.String

public open class InitGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.InitGroup,
) : InitElement(cdkObject) {
  /**
   * Returns the init element type for this element.
   */
  public override fun elementType(): String = unwrap(this).getElementType()

  public companion object {
    public fun fromName(groupName: String): InitGroup =
        software.amazon.awscdk.services.ec2.InitGroup.fromName(groupName).let(InitGroup::wrap)

    public fun fromName(groupName: String, groupId: Number): InitGroup =
        software.amazon.awscdk.services.ec2.InitGroup.fromName(groupName,
        groupId).let(InitGroup::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitGroup): InitGroup =
        InitGroup(cdkObject)

    internal fun unwrap(wrapped: InitGroup): software.amazon.awscdk.services.ec2.InitGroup =
        wrapped.cdkObject
  }
}
