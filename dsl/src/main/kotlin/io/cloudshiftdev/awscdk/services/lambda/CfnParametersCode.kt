package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnParameter
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.Location
import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class CfnParametersCode internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.CfnParametersCode,
) : Code(cdkObject) {
  /**
   * Create a parameters map from this instance's CloudFormation parameters.
   *
   * It returns a map with 2 keys that correspond to the names of the parameters defined in this
   * Lambda code,
   * and as values it contains the appropriate expressions pointing at the provided S3 location
   * (most likely, obtained from a CodePipeline Artifact by calling the `artifact.s3Location`
   * method).
   * The result should be provided to the CloudFormation Action
   * that is deploying the Stack that the Lambda with this code is part of,
   * in the `parameterOverrides` property.
   *
   * @param location the location of the object in S3 that represents the Lambda code. 
   */
  public open fun assign(location: Location): Map<String, Any> =
      unwrap(this).assign(location.let(Location::unwrap)) ?: emptyMap()

  /**
   * Create a parameters map from this instance's CloudFormation parameters.
   *
   * It returns a map with 2 keys that correspond to the names of the parameters defined in this
   * Lambda code,
   * and as values it contains the appropriate expressions pointing at the provided S3 location
   * (most likely, obtained from a CodePipeline Artifact by calling the `artifact.s3Location`
   * method).
   * The result should be provided to the CloudFormation Action
   * that is deploying the Stack that the Lambda with this code is part of,
   * in the `parameterOverrides` property.
   *
   * @param location the location of the object in S3 that represents the Lambda code. 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("763bde8316faa202313b1726887e0e19b556f1a821ee54d3e2ebf1d920950e12")
  public open fun assign(location: Location.Builder.() -> Unit): Map<String, Any> =
      assign(Location(location))

  /**
   * Called when the lambda or layer is initialized to allow this object to bind to the stack, add
   * resources and have fun.
   *
   * @param scope 
   */
  public override fun bind(scope: Construct): CodeConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(CodeConfig::wrap)

  /**
   *
   */
  public open fun bucketNameParam(): String = unwrap(this).getBucketNameParam()

  /**
   * Determines whether this Code is inline code or not.
   */
  public open fun isInline(): Boolean = unwrap(this).getIsInline()

  /**
   *
   */
  public open fun objectKeyParam(): String = unwrap(this).getObjectKeyParam()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.CfnParametersCode].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The CloudFormation parameter that represents the name of the S3 Bucket where the Lambda code
     * will be located in.
     *
     * Must be of type 'String'.
     *
     * Default: a new parameter will be created
     *
     * @param bucketNameParam The CloudFormation parameter that represents the name of the S3 Bucket
     * where the Lambda code will be located in. 
     */
    public fun bucketNameParam(bucketNameParam: CfnParameter)

    /**
     * The CloudFormation parameter that represents the path inside the S3 Bucket where the Lambda
     * code will be located at.
     *
     * Must be of type 'String'.
     *
     * Default: a new parameter will be created
     *
     * @param objectKeyParam The CloudFormation parameter that represents the path inside the S3
     * Bucket where the Lambda code will be located at. 
     */
    public fun objectKeyParam(objectKeyParam: CfnParameter)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnParametersCode.Builder =
        software.amazon.awscdk.services.lambda.CfnParametersCode.Builder.create()

    /**
     * The CloudFormation parameter that represents the name of the S3 Bucket where the Lambda code
     * will be located in.
     *
     * Must be of type 'String'.
     *
     * Default: a new parameter will be created
     *
     * @param bucketNameParam The CloudFormation parameter that represents the name of the S3 Bucket
     * where the Lambda code will be located in. 
     */
    override fun bucketNameParam(bucketNameParam: CfnParameter) {
      cdkBuilder.bucketNameParam(bucketNameParam.let(CfnParameter::unwrap))
    }

    /**
     * The CloudFormation parameter that represents the path inside the S3 Bucket where the Lambda
     * code will be located at.
     *
     * Must be of type 'String'.
     *
     * Default: a new parameter will be created
     *
     * @param objectKeyParam The CloudFormation parameter that represents the path inside the S3
     * Bucket where the Lambda code will be located at. 
     */
    override fun objectKeyParam(objectKeyParam: CfnParameter) {
      cdkBuilder.objectKeyParam(objectKeyParam.let(CfnParameter::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnParametersCode =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnParametersCode {
      val builderImpl = BuilderImpl()
      return CfnParametersCode(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnParametersCode):
        CfnParametersCode = CfnParametersCode(cdkObject)

    internal fun unwrap(wrapped: CfnParametersCode):
        software.amazon.awscdk.services.lambda.CfnParametersCode = wrapped.cdkObject
  }
}
