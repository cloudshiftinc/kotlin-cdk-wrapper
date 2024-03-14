package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

public open class GenericSSMParameterImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.GenericSSMParameterImage,
) : CdkObject(cdkObject), IMachineImage {
  /**
   * Return the image to use in the given context.
   *
   * @param scope 
   */
  public override fun image(scope: Construct): MachineImageConfig =
      unwrap(this).getImage(scope.let(Construct::unwrap)).let(MachineImageConfig::wrap)

  /**
   * Name of the SSM parameter we're looking up.
   */
  public open fun parameterName(): String = unwrap(this).getParameterName()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.GenericSSMParameterImage):
        GenericSSMParameterImage = GenericSSMParameterImage(cdkObject)

    internal fun unwrap(wrapped: GenericSSMParameterImage):
        software.amazon.awscdk.services.ec2.GenericSSMParameterImage = wrapped.cdkObject
  }
}
