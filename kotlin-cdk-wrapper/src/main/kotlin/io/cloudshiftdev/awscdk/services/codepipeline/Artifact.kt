@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.Location
import kotlin.Any
import kotlin.String

/**
 * An output artifact of an action.
 *
 * Artifacts can be used as input by some actions.
 *
 * Example:
 *
 * ```
 * // later:
 * PipelineProject project;
 * LambdaInvokeAction lambdaInvokeAction = LambdaInvokeAction.Builder.create()
 * .actionName("Lambda")
 * .lambda(Function.Builder.create(this, "Func")
 * .runtime(Runtime.NODEJS_LATEST)
 * .handler("index.handler")
 * .code(Code.fromInline("\n        const { CodePipeline } =
 * require('&#64;aws-sdk/client-codepipeline');\n\n        exports.handler = async function(event,
 * context) {\n            const codepipeline = new AWS.CodePipeline();\n            await
 * codepipeline.putJobSuccessResult({\n                jobId: event['CodePipeline.job'].id,\n          
 *      outputVariables: {\n                    MY_VAR: \"some value\",\n                },\n          
 *  });\n        }\n    "))
 * .build())
 * .variablesNamespace("MyNamespace")
 * .build();
 * Artifact sourceOutput = new Artifact();
 * CodeBuildAction.Builder.create()
 * .actionName("CodeBuild")
 * .project(project)
 * .input(sourceOutput)
 * .environmentVariables(Map.of(
 * "MyVar", BuildEnvironmentVariable.builder()
 * .value(lambdaInvokeAction.variable("MY_VAR"))
 * .build()))
 * .build();
 * ```
 */
public open class Artifact(
  cdkObject: software.amazon.awscdk.services.codepipeline.Artifact,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.codepipeline.Artifact()
  )

  public constructor(artifactName: String) :
      this(software.amazon.awscdk.services.codepipeline.Artifact(artifactName)
  )

  /**
   *
   */
  public open fun artifactName(): String? = unwrap(this).getArtifactName()

  /**
   * Returns an ArtifactPath for a file within this artifact.
   *
   * CfnOutput is in the form "<artifact-name>::<file-name>"
   *
   * @param fileName The name of the file. 
   */
  public open fun atPath(fileName: String): ArtifactPath =
      unwrap(this).atPath(fileName).let(ArtifactPath::wrap)

  /**
   * The artifact attribute for the name of the S3 bucket where the artifact is stored.
   */
  public open fun bucketName(): String = unwrap(this).getBucketName()

  /**
   * Retrieve the metadata stored in this artifact under the given key.
   *
   * If there is no metadata stored under the given key,
   * null will be returned.
   *
   * @param key 
   */
  public open fun metadata(key: String): Any = unwrap(this).getMetadata(key)

  /**
   * Add arbitrary extra payload to the artifact under a given key.
   *
   * This can be used by CodePipeline actions to communicate data between themselves.
   * If metadata was already present under the given key,
   * it will be overwritten with the new value.
   *
   * @param key 
   * @param value 
   */
  public open fun metadata(key: String, `value`: Any) {
    unwrap(this).setMetadata(key, `value`)
  }

  /**
   * The artifact attribute for The name of the .zip file that contains the artifact that is
   * generated by AWS CodePipeline, such as 1ABCyZZ.zip.
   */
  public open fun objectKey(): String = unwrap(this).getObjectKey()

  /**
   * Returns a token for a value inside a JSON file within this artifact.
   *
   * @param jsonFile The JSON file name. 
   * @param keyName The hash key. 
   */
  public open fun `param`(jsonFile: String, keyName: String): String =
      unwrap(this).getParam(jsonFile, keyName)

  /**
   * Returns the location of the .zip file in S3 that this Artifact represents. Used by Lambda's
   * `CfnParametersCode` when being deployed in a CodePipeline.
   */
  public open fun s3Location(): Location = unwrap(this).getS3Location().let(Location::wrap)

  /**
   * The artifact attribute of the Amazon Simple Storage Service (Amazon S3) URL of the artifact,
   * such as
   * https://s3-us-west-2.amazonaws.com/artifactstorebucket-yivczw8jma0c/test/TemplateSo/1ABCyZZ.zip.
   */
  public open fun url(): String = unwrap(this).getUrl()

  public companion object {
    public fun artifact(name: String): Artifact =
        software.amazon.awscdk.services.codepipeline.Artifact.artifact(name).let(Artifact::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.Artifact): Artifact =
        Artifact(cdkObject)

    internal fun unwrap(wrapped: Artifact): software.amazon.awscdk.services.codepipeline.Artifact =
        wrapped.cdkObject as software.amazon.awscdk.services.codepipeline.Artifact
  }
}
