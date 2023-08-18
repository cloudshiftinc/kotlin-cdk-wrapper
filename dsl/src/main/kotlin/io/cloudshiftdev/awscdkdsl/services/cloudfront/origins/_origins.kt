@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.cloudfront.origins

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RestApi
import software.amazon.awscdk.services.cloudfront.origins.HttpOrigin
import software.amazon.awscdk.services.cloudfront.origins.HttpOriginProps
import software.amazon.awscdk.services.cloudfront.origins.LoadBalancerV2Origin
import software.amazon.awscdk.services.cloudfront.origins.LoadBalancerV2OriginProps
import software.amazon.awscdk.services.cloudfront.origins.OriginGroup
import software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps
import software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin
import software.amazon.awscdk.services.cloudfront.origins.RestApiOriginProps
import software.amazon.awscdk.services.cloudfront.origins.S3Origin
import software.amazon.awscdk.services.cloudfront.origins.S3OriginProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ILoadBalancerV2
import software.amazon.awscdk.services.s3.IBucket

public object origins {
    /**
     * An Origin for an HTTP server or S3 bucket configured for website hosting.
     *
     * Example:
     * ```
     * // Validating signed URLs or signed cookies with Trusted Key Groups
     * // public key in PEM format
     * String publicKey;
     * PublicKey pubKey = PublicKey.Builder.create(this, "MyPubKey")
     * .encodedKey(publicKey)
     * .build();
     * KeyGroup keyGroup = KeyGroup.Builder.create(this, "MyKeyGroup")
     * .items(List.of(pubKey))
     * .build();
     * Distribution.Builder.create(this, "Dist")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(new HttpOrigin("www.example.com"))
     * .trustedKeyGroups(List.of(keyGroup))
     * .build())
     * .build();
     * ```
     */
    public inline fun httpOrigin(
        domainName: String,
        block: HttpOriginDsl.() -> Unit = {}
    ): HttpOrigin {
        val builder = HttpOriginDsl(domainName)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an Origin backed by an S3 website-configured bucket, load balancer, or custom
     * HTTP server.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.cloudfront.*;
     * import software.amazon.awscdk.services.cloudfront.origins.*;
     * HttpOriginProps httpOriginProps = HttpOriginProps.builder()
     * .connectionAttempts(123)
     * .connectionTimeout(Duration.minutes(30))
     * .customHeaders(Map.of(
     * "customHeadersKey", "customHeaders"))
     * .httpPort(123)
     * .httpsPort(123)
     * .keepaliveTimeout(Duration.minutes(30))
     * .originId("originId")
     * .originPath("originPath")
     * .originShieldEnabled(false)
     * .originShieldRegion("originShieldRegion")
     * .originSslProtocols(List.of(OriginSslPolicy.SSL_V3))
     * .protocolPolicy(OriginProtocolPolicy.HTTP_ONLY)
     * .readTimeout(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun httpOriginProps(block: HttpOriginPropsDsl.() -> Unit = {}): HttpOriginProps {
        val builder = HttpOriginPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An Origin for a v2 load balancer.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.ec2.*;
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * Vpc vpc;
     * // Create an application load balancer in a VPC. 'internetFacing' must be 'true'
     * // for CloudFront to access the load balancer and use it as an origin.
     * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this, "LB")
     * .vpc(vpc)
     * .internetFacing(true)
     * .build();
     * Distribution.Builder.create(this, "myDist")
     * .defaultBehavior(BehaviorOptions.builder().origin(new LoadBalancerV2Origin(lb)).build())
     * .build();
     * ```
     */
    public inline fun loadBalancerV2Origin(
        loadBalancer: ILoadBalancerV2,
        block: LoadBalancerV2OriginDsl.() -> Unit = {}
    ): LoadBalancerV2Origin {
        val builder = LoadBalancerV2OriginDsl(loadBalancer)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an Origin backed by a v2 load balancer.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
     * ApplicationLoadBalancer loadBalancer;
     * LoadBalancerV2Origin origin = LoadBalancerV2Origin.Builder.create(loadBalancer)
     * .connectionAttempts(3)
     * .connectionTimeout(Duration.seconds(5))
     * .readTimeout(Duration.seconds(45))
     * .keepaliveTimeout(Duration.seconds(45))
     * .protocolPolicy(OriginProtocolPolicy.MATCH_VIEWER)
     * .build();
     * ```
     */
    public inline fun loadBalancerV2OriginProps(
        block: LoadBalancerV2OriginPropsDsl.() -> Unit = {}
    ): LoadBalancerV2OriginProps {
        val builder = LoadBalancerV2OriginPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An Origin that represents a group.
     *
     * Consists of a primary Origin, and a fallback Origin called when the primary returns one of
     * the provided HTTP status codes.
     *
     * Example:
     * ```
     * Bucket myBucket = new Bucket(this, "myBucket");
     * Distribution.Builder.create(this, "myDist")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(OriginGroup.Builder.create()
     * .primaryOrigin(new S3Origin(myBucket))
     * .fallbackOrigin(new HttpOrigin("www.example.com"))
     * // optional, defaults to: 500, 502, 503 and 504
     * .fallbackStatusCodes(List.of(404))
     * .build())
     * .build())
     * .build();
     * ```
     */
    public inline fun originGroup(block: OriginGroupDsl.() -> Unit = {}): OriginGroup {
        val builder = OriginGroupDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties for `OriginGroup`.
     *
     * Example:
     * ```
     * Bucket myBucket = new Bucket(this, "myBucket");
     * Distribution.Builder.create(this, "myDist")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(OriginGroup.Builder.create()
     * .primaryOrigin(new S3Origin(myBucket))
     * .fallbackOrigin(new HttpOrigin("www.example.com"))
     * // optional, defaults to: 500, 502, 503 and 504
     * .fallbackStatusCodes(List.of(404))
     * .build())
     * .build())
     * .build();
     * ```
     */
    public inline fun originGroupProps(
        block: OriginGroupPropsDsl.() -> Unit = {}
    ): OriginGroupProps {
        val builder = OriginGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An Origin for an API Gateway REST API.
     *
     * Example:
     * ```
     * RestApi api;
     * Distribution.Builder.create(this, "Distribution")
     * .defaultBehavior(BehaviorOptions.builder().origin(new RestApiOrigin(api)).build())
     * .build();
     * ```
     */
    public inline fun restApiOrigin(
        restApi: RestApi,
        block: RestApiOriginDsl.() -> Unit = {}
    ): RestApiOrigin {
        val builder = RestApiOriginDsl(restApi)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an Origin for an API Gateway REST API.
     *
     * Example:
     * ```
     * RestApi api;
     * Distribution.Builder.create(this, "Distribution")
     * .defaultBehavior(BehaviorOptions.builder().origin(RestApiOrigin.Builder.create(api).originPath("/custom-origin-path").build()).build())
     * .build();
     * ```
     */
    public inline fun restApiOriginProps(
        block: RestApiOriginPropsDsl.() -> Unit = {}
    ): RestApiOriginProps {
        val builder = RestApiOriginPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An Origin that is backed by an S3 bucket.
     *
     * If the bucket is configured for website hosting, this origin will be configured to use the
     * bucket as an HTTP server origin and will use the bucket's configured website redirects and
     * error handling. Otherwise, the origin is created as a bucket origin and will use CloudFront's
     * redirect and error handling.
     *
     * Example:
     * ```
     * // Adding an existing Lambda&#64;Edge function created in a different stack
     * // to a CloudFront distribution.
     * Bucket s3Bucket;
     * IVersion functionVersion = Version.fromVersionArn(this, "Version",
     * "arn:aws:lambda:us-east-1:123456789012:function:functionName:1");
     * Distribution.Builder.create(this, "distro")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(new S3Origin(s3Bucket))
     * .edgeLambdas(List.of(EdgeLambda.builder()
     * .functionVersion(functionVersion)
     * .eventType(LambdaEdgeEventType.VIEWER_REQUEST)
     * .build()))
     * .build())
     * .build();
     * ```
     */
    public inline fun s3Origin(bucket: IBucket, block: S3OriginDsl.() -> Unit = {}): S3Origin {
        val builder = S3OriginDsl(bucket)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to use to customize an S3 Origin.
     *
     * Example:
     * ```
     * Bucket myBucket = new Bucket(this, "myBucket");
     * Distribution.Builder.create(this, "myDist")
     * .defaultBehavior(BehaviorOptions.builder().origin(S3Origin.Builder.create(myBucket)
     * .customHeaders(Map.of(
     * "Foo", "bar"))
     * .build()).build())
     * .build();
     * ```
     */
    public inline fun s3OriginProps(block: S3OriginPropsDsl.() -> Unit = {}): S3OriginProps {
        val builder = S3OriginPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
