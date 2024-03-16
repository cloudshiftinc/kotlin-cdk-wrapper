@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String

/**
 * An SSM Parameter reference.
 */
public interface IParameter : IResource {
  /**
   * Grants read (DescribeParameter, GetParameters, GetParameter, GetParameterHistory) permissions
   * on the SSM Parameter.
   *
   * @param grantee the role to be granted read-only access to the parameter. 
   */
  public fun grantRead(grantee: IGrantable): Grant

  /**
   * Grants write (PutParameter) permissions on the SSM Parameter.
   *
   * @param grantee the role to be granted write access to the parameter. 
   */
  public fun grantWrite(grantee: IGrantable): Grant

  /**
   * The ARN of the SSM Parameter resource.
   */
  public fun parameterArn(): String

  /**
   * The name of the SSM Parameter resource.
   */
  public fun parameterName(): String

  /**
   * The type of the SSM Parameter resource.
   */
  public fun parameterType(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.IParameter): IParameter =
        CdkObjectWrappers.wrap(cdkObject) as IParameter

    internal fun unwrap(wrapped: IParameter): software.amazon.awscdk.services.ssm.IParameter =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ssm.IParameter
  }
}
