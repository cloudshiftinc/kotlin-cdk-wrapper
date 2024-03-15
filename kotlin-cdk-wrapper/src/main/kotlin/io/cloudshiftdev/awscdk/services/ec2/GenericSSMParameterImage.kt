@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * Select the image based on a given SSM parameter at deployment time of the CloudFormation Stack.
 *
 * This Machine Image automatically updates to the latest version on every
 * deployment. Be aware this will cause your instances to be replaced when a
 * new version of the image becomes available. Do not store stateful information
 * on the instance if you are using this image.
 *
 * The AMI ID is selected using the values published to the SSM parameter store.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * UserData userData;
 * GenericSSMParameterImage genericSSMParameterImage = new GenericSSMParameterImage("parameterName",
 * OperatingSystemType.LINUX, userData);
 * ```
 */
public open class GenericSSMParameterImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.GenericSSMParameterImage,
) : CdkObject(cdkObject), IMachineImage {
  public constructor(
    parameterName: String,
    os: OperatingSystemType,
    userData: UserData,
  ) : this(software.amazon.awscdk.services.ec2.GenericSSMParameterImage(parameterName,
      OperatingSystemType.unwrap(os), UserData.unwrap(userData)))

  public constructor(parameterName: String, os: OperatingSystemType) :
      this(software.amazon.awscdk.services.ec2.GenericSSMParameterImage(parameterName,
      OperatingSystemType.unwrap(os)))

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
