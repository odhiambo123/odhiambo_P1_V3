<%@include file="header1.html"%>
  <!--======= SUB BANNER =========-->
  <section class="sub-banner bg-parallax" style="background:url(images/bg/about-bg-1.jpg) no-repeat">
    <div class="container">
      <div class="position-center-center">
        <h1>contact us</h1>
      </div>
    </div>
  </section>
  
  <!-- Content -->
  <div id="content">
    <section class="contact  padding-bottom-100"> 
      
      <!-- MAP  -->
      <div class="contact style-2">
        <div id="map"></div>
      </div>
      
      <!-- Conatct Pages  -->
      
      <!-- Contact  -->
      <div class="contact style-3 light-gray-bg padding-top-40 padding-bottom-80">
        <div class="container">
          <div class="heading-block text-center margin-bottom-80">
            <h3>Get In Touch With Us</h3>
            <hr>
            <span class=" margin-top-20">The weather started getting rough - the tiny ship was tossed. If not for the courage of the fearless crew the Minnow would be lost. the Minnow always wanted to have a neighbor just like you. I've always wanted to live in a neighborhood with you. </span> </div>
          
          <!-- Form  -->
          <div class="contact-right padding-top-30 padding-left-30"> 
            <!-- Success Msg -->
            <div id="contact_message" class="success-msg"> <i class="fa fa-paper-plane-o"></i>Thank You. Your Message has been Submitted</div>
            
            <!-- FORM -->
            <form action="registerClaim" role="form" id="contact_form" class="contact-form" method="POST" onSubmit="return true">
              <ul class="row">
                <li class="col-sm-4">
                  <label>
                    <input type="text" class="form-control" name="name" id="name" placeholder="Name *">
                  </label>
                </li>
                <li class="col-sm-4">
                  <label>
                    <input type="text" class="form-control" name="email" id="email" placeholder="Email address *">
                  </label>
                </li>
                <li class="col-sm-4">
                  <label>
                    <input type="text" class="form-control" name="company" id="company" placeholder="Phone number">
                  </label>
                </li>
                <li class="col-sm-12">
                  <label>
                    <textarea class="form-control" name="message" id="message" rows="5" placeholder="Your Message"></textarea>
                  </label>
                </li>
                <li class="col-sm-12">
                  <button type="submit" class="btn" value="submit" id="btn_submit" onClick="proceed();">send message</button>
                </li>
              </ul>
            </form>
          </div>
        </div>
      </div>
    </section>
</div>
<%@include file="footer1.html"%>