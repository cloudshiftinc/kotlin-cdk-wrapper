@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

public open class GenericSSMParameterImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.GenericSSMParameterImage,
) : CdkObject(cdkObject), IMachineImage {
  public override fun image(scope: Construct): MachineImageConfig =
      unwrap(this).getImage(scope.let(Construct::unwrap)).let(MachineImageConfig::wrap)

  public open fun parameterName(): String = unwrap(this).getParameterName()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.GenericSSMParameterImage):
        GenericSSMParameterImage = GenericSSMParameterImage(cdkObject)

    internal fun unwrap(wrapped: GenericSSMParameterImage):
        software.amazon.awscdk.services.ec2.GenericSSMParameterImage = wrapped.cdkObject
  }
}
