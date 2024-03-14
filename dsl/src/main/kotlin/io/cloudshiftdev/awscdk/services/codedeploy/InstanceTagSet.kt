package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public open class InstanceTagSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codedeploy.InstanceTagSet,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun instanceTagGroups(): List<Map<String, List<String>>> =
      unwrap(this).getInstanceTagGroups()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.InstanceTagSet):
        InstanceTagSet = InstanceTagSet(cdkObject)

    internal fun unwrap(wrapped: InstanceTagSet):
        software.amazon.awscdk.services.codedeploy.InstanceTagSet = wrapped.cdkObject
  }
}
